package com.thealgorithms.searches;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RecursiveSearchSortedArrayTest {
  @Test
  public void recursiveSearchSortedArrayTest() {
    assertEquals(true,RecursiveSearchSortedArray.search({-1, 1, 2, 4}, 1));
    assertEquals(false,RecursiveSearchSortedArray.search({-1, 1, 2, 4}, 3));
  }
}
