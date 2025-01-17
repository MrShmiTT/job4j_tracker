package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitAction(out));

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu"
                        + System.lineSeparator()
                        + "0. Exit Program"
                        + System.lineSeparator()
        ));
    }

    @Test
    public void whenCreateItem() {
        Output out = new ConsoleOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(out));
        actions.add(new ExitAction(out));

        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replace item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ReplaceAction(out));
        actions.add(new ExitAction(out));

        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new DeleteAction(out));
        actions.add(new ExitAction(out));

        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ReplaceAction(out));
        actions.add(new ExitAction(out));

        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        menuAssertOne(out, ln);
    }

    private void menuAssertOne(Output out, String ln) {
        assertThat(out.toString(), is(
                "Menu" + ln
                        + "0. Edit Item" + ln
                        + "1. Exit Program" + ln
                        + "=== Edit Item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu" + ln
                        + "0. Edit Item" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenFindAllOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ShowAction(out));
        actions.add(new ExitAction(out));

        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        menuAssertTwo(out, one, ln);
    }

    private void menuAssertTwo(Output out, Item one, String ln) {
        assertThat(out.toString(), is(
                "Menu" + ln
                        + "0. Show all Items" + ln
                        + "1. Exit Program" + ln
                        + "=== Show all Items ===" + ln
                        + one + ln
                        + "Menu" + ln
                        + "0. Show all Items" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenFindByNameOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", one.getName(), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindByNameAction(out));
        actions.add(new ExitAction(out));

        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        menuAssertThree(out, one, ln);
    }

    private void menuAssertThree(Output out, Item one, String ln) {
        assertThat(out.toString(), is(
                "Menu" + ln
                        + "0. Find Items by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find Items by name ===" + ln
                        + one + ln
                        + "Menu" + ln
                        + "0. Find Items by name" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenFindByIdOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindByIdAction(out));
        actions.add(new ExitAction(out));

        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        menuAssertFour(out, one, ln);
    }

    private void menuAssertFour(Output out, Item one, String ln) {
        assertThat(out.toString(), is(
                "Menu" + ln
                        + "0. Find Item by ID" + ln
                        + "1. Exit Program" + ln
                        + "=== Find Item by id ===" + ln
                        + one + ln
                        + "Menu" + ln
                        + "0. Find Item by ID" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(
                new String[]{"7", "0"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitAction(out));

        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu" + ln
                        + "0. Exit Program" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu" + ln
                        + "0. Exit Program" + ln
        ));
    }
}