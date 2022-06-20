package com.test.solution;

public class DP_42898 {
    public int solution(int m, int n, int[][] puddles) {
        int[][] path = new int[m][n];
        
        for(int i=0; i<puddles.length; i++) {
        	if(puddles[i][0] == 1) {
        		for(int j=puddles[i][1]-1; j<n; j++) path[0][j] = -1;
        	}
        	if(puddles[i][1] == 1) {
        		for(int j=puddles[i][0]-1; j<m; j++) path[j][0] = -1;
        	}
        	path[puddles[i][0]-1][puddles[i][1]-1] = -1;
        }
        
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		if(path[i][j] == -1){
        			path[i][j] = 0;
        		}else if(i==0 || j==0) {
        			path[i][j] = 1;
        		}else {
        			path[i][j] = (path[i-1][j] + path[i][j-1]) % 1000000007;
        		}
        	}
        }

        return path[m-1][n-1];
    }
}
