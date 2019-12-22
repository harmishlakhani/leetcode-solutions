package com.techmisal.medium;

import java.util.Arrays;

public class NumberOfIslands {

    private static char isLand = '1';
    private static int size = 1000;
    private Boolean[][] islandsMemo = new Boolean[size][size];
    private int xRange;
    private int yRange;

    public NumberOfIslands() {
        for(int x=0;x<size;x++) {
            Arrays.fill(islandsMemo[x], true);
        }
    }

    private void initSolution(char[][] grid) {
        xRange = grid.length;
        if(xRange == 0) return;
        yRange = grid[0].length;
    }

    public Boolean isIsland(char a) {
        return a == isLand;
    }

    private void flood(int x, int y, char[][] grid) {
        Boolean isOutOfXBound = ( x < 0 ) || (x >= xRange);
        Boolean isOutOfYBound = ( y < 0 ) || (y >= yRange);

        if(isOutOfXBound || isOutOfYBound) return;

        Boolean isWater = !isIsland(grid[x][y]);
        Boolean isFoundBefore = !islandsMemo[x][y];
        if(isWater || isFoundBefore) return;

        islandsMemo[x][y] = false;
        this.flood(x,y+1, grid);
        this.flood(x,y-1, grid);
        this.flood(x+1,y, grid);
        this.flood(x-1,y, grid);
    }

    public int numIslands(char[][] grid) {

        initSolution(grid);
        int result = 0;

        for(int x=0;x<grid.length;x++)
            for(int y=0;y<grid[x].length;y++) {
                char currentPosition = grid[x][y];
                Boolean isNewIsland = islandsMemo[x][y];
                if(isIsland(currentPosition) && isNewIsland) {
                    result++;
                    flood(x, y, grid);
                }
            }

        return result;
    }
}
