package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void updateMatrixTest() {
        Solution solution = new Solution();
        int[][] inputOne = new int[][] {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        int[][] outputOne = new int[][] {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        assertEquals(outputOne, solution.updateMatrix(inputOne));

        int[][] inputTwo = new int[][] {
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };
        int[][] outputTwo = new int[][] {
                {0,0,0},
                {0,1,0},
                {1,2,1}
        };
        assertEquals(outputTwo, solution.updateMatrix(inputTwo));
    }

}