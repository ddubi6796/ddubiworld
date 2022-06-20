package com.test.solution;

public class DP_43105 {
	public int solution(int[][] triangle) {
            
        for(int i=triangle.length-1; i>0; i--) {
        	for(int j=1; j<triangle[i].length; j++) {
        		int localMax = Math.max(triangle[i][j-1], triangle[i][j]);
        		triangle[i-1][j-1] = triangle[i-1][j-1] + localMax;
        	}
        }
        
        return triangle[0][0];
    }
}
