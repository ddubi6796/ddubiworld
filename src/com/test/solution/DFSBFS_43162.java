package com.test.solution;

import java.util.Arrays;

public class DFSBFS_43162 {
    public int solution(int n, int[][] computers) {
    	int[] root = new int[n];
        
        for(int i=0; i<n; i++) {
        	root[i] = i;
        }
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		if(computers[i][j] == 1) {
        			int min = Math.min(root[i], root[j]);
        			for(int r=0; r<n; r++) {
        				if(root[r] == root[i])	root[r] = min;
        			}
        			root[i] = min;
        			root[j] = min;
        		}
        	}
        }
        
        return (int) Arrays.stream(root).distinct().count();
    }
}
