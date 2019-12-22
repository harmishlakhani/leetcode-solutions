package com.techmisal.medium;

public class SearchA2DMatrixII
{
    public SearchA2DMatrixII()
    {
        // Empty to use tests
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i1 = 0; i1 < matrix.length; i1++)
        {
            for(int i2 = 0; i2 < matrix[0].length; i2++)
            {
                if(matrix[i1][i2] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
