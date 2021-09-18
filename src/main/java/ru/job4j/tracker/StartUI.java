package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(input.askStr("Enter id: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = input.askStr("Enter id: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item);
            } else if (select == 1) {
                System.out.println("=== Show all Items ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Харнилище еще не содержит заявок");
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ===");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                System.out.print("Enter name: ");
                String name = input.askStr("Enter id: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка изменена успешно.");
                } else {
                    System.out.println("Ошибка замены заявки.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                if (tracker.delete(id)) {
                    System.out.println("Заявка удалена успешно.");
                } else {
                    System.out.println("Ошибка удаленеия заявки.");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by id ===");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка с введенным id: " + id + " не найдена.");
                }
            } else if (select == 5) {
                System.out.println("=== Find Items by name ===");
                System.out.print("Enter name: ");
                String name = input.askStr("Enter id: ");
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с именем: " + name + " не найдены.");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all Items", "Edit Item",
                "Delete Item", "Find Item by ID", "Find Items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

}