package com.adamtharani;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test(expected = NullPointerException.class)
    public void testNullArray() {
        App.characterOccurence(null, 'a');
    }

    @Test
    public void testEmptyArray() {
        char[] arr = new char[0];
        int count = App.characterOccurence(arr, 'a');
        assertEquals(0, count);
    }

    @Test
    public void testCharPresent() {
        char[] arr = {'a', 'b', 'c', 'd', 'a'};
        int count = App.characterOccurence(arr, 'a');
        assertEquals(2, count);
    }

    @Test
    public void testCharNotPresent() {
        char[] arr = {'a', 'b', 'c', 'd', 'a'};
        int count = App.characterOccurence(arr, 'e');
        assertEquals(0, count);
    }

    @Test
    public void testCharPresentLoopBypassed() {
        char[] arr = {'a', 'b', 'c', 'd', 'a'};
        int count = App.characterOccurence(arr, 'a');
        assertEquals(2, count);
    }

    @Test
    public void testCharNotPresentLoopBypassed() {
        char[] arr = {'a', 'b', 'c', 'd', 'a'};
        int count = App.characterOccurence(arr, 'e');
        assertEquals(0, count);
    }


}
