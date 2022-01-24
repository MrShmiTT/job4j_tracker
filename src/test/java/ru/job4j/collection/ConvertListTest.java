package ru.job4j.collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ConvertListTest {

    @Test
    public void whenToList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expected));
    }
}