package com.techmisal.medium;

import static org.junit.Assert.*;
import org.junit.Test;

public class SearchA2DMatrixIITest
{

    @Test
    public void testSearchMatrix()
    {
        SearchA2DMatrixII a = new SearchA2DMatrixII();
        
        int[][] matrix = new int[][]{
                {5,1,3,2},
                {1,6,9,3}
        };
        assertEquals(true, a.searchMatrix(matrix, 5));
        assertEquals(false, a.searchMatrix(matrix, 0));
    }

}
