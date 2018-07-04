package by.bntu.oop.exam.mihasev.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortTest {

    public SortTest() {
    }

    @Test
    public void testSort() {
        System.out.println("sort");
        int[] array = {7, 2, 2, 5, 7, 3, 5, 8, 5, 5};
        int[] expResult = {2, 8, 5, 5, 5, 5, 7, 3, 7, 2};
        int[] result = Sort.sort(array);
        assertArrayEquals(expResult, result);

    }

    @Test
    public void testWane() {
        System.out.println("wane");
        int[] part2 = {2, 3, 1, 5, 6, 8};
        int[] expResult = {8, 6, 5, 3, 2, 1};
        int[] result = Sort.wane(part2);
        assertArrayEquals(expResult, result);

    }

    @Test
    public void testIncrease() {
        System.out.println("increase");
        int[] part1 = {2, 3, 1, 5, 6, 8};
        int[] expResult = {1,2,3,5,6,8};
        int[] result = Sort.increase(part1);
        assertArrayEquals(expResult, result);

    }

}
