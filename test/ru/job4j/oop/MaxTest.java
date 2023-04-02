package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int expected = 2;
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To2AndTo3Then3() {
        int expected = 3;
        int left = 1;
        int right = 2;
        int up = 3;
        int result = Max.max(left, right, up);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To2To3AndTo4Then4() {
        int expected = 4;
        int left = 1;
        int right = 2;
        int up = 3;
        int down = 4;
        int result = Max.max(left, right, up, down);
        Assert.assertEquals(expected, result);
    }
}