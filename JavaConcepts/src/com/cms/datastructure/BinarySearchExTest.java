package com.cms.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchExTest {
	@Test
    public void testContains() {
            int[]a = {1, 2, 3, 4, 5, 7, 17,  19 };
//            assertTrue(BinarySearch.contains(a, 17));
            assertTrue(BinarySearchEx.contains(a, 1));
            assertTrue(BinarySearchEx.contains(a, 2));
            assertTrue(BinarySearchEx.contains(a, 3));
            assertTrue(BinarySearchEx.contains(a, 4));
            assertFalse(BinarySearchEx.contains(a, 10));
    }
}
