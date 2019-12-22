package com.techmisal.medium;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfIslandsTest {
    private NumberOfIslands solver = new NumberOfIslands();

    @Test
    public void shouldReturnZero() {
        char[][] island = new char[0][0];
        int actualResult = solver.numIslands(island);
        int expectedResult = 0;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldReturnOne() {
        char[][] island = new char[][]{
                {'0', '0', '0'},
                {'0', '0', '1'},
                {'0', '1', '1'},
        };
        int actualResult = solver.numIslands(island);
        int expectedResult = 1;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldReturnThree() {
        char[][] island = new char[][]{
                {'0', '0', '0', '1', '0', '1'},
                {'0', '0', '1', '0', '0', '0'},
                {'0', '1', '1', '0', '0', '0'},
        };
        int actualResult = solver.numIslands(island);
        int expectedResult = 3;
        Assert.assertEquals(actualResult, expectedResult);
    }

}
