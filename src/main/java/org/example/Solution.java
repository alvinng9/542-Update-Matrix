package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        //initialize the queue
        Queue<int[]> q = new LinkedList<>();
        //initialize a new 2d array
        int[][] result = new int[mat.length][mat[0].length];
        //interate through the given array
        //if the value at the current index is 0, add it to the queue
        //if the value at the current index is not 0, make it become 99999
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new int[]{i, j});
                } else {
                    result[i][j] = 99999;
                }
            }
        }

        //create direction arrays
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, 1, -1};

        //iterate through the queue
        while(!q.isEmpty()) {
            int x = q.peek()[0];
            int y = q.remove()[1];
            //look at four different directions
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                //modify the indexes are not out of bounds
                //and the value is bigger than its neighbor
                if (nx >= 0 && ny >= 0 && nx < mat.length && ny < mat[0].length && result[nx][ny] > result[x][y]) {
                    result[nx][ny] = result[x][y] + 1;
                    //add the new case back to the queue
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        return result;
    }
}
