package com.test.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Greedy_42861 {
	
    public int solution(int n, int[][] costs) {
        HashMap<Integer, Integer> root = new HashMap<>();
        
        for(int[] c : costs) {
        	int c0 = c[0], c1 = c[1];
        	c[0] = Math.min(c0, c1);
        	c[1] = Math.max(c0, c1);
        	root.put(c0, c0);
        	root.put(c1, c1);
        }
        Arrays.sort(costs, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[]o2) {
				return o1[2]-o2[2];
			}
		});
        
        root.put(costs[0][1], costs[0][0]);
        int answer = costs[0][2];

        int minValue = Collections.min(root.keySet());

        for(int i=1; i<costs.length; i++) {        	
        	if(root.get(costs[i][0]) == root.get(costs[i][1])) {
        		continue;
        	}
        	else if(root.get(costs[i][0]) == minValue) {
        		for(int key : root.keySet()) {
        			if(key != costs[i][1] && root.get(key) == root.get(costs[i][1])) root.put(key, minValue);
        		}
        		root.put(costs[i][1], minValue);
        	}
        	else if(root.get(costs[i][1]) == minValue) {
        		for(int key : root.keySet()) {
        			if(key != costs[i][0] && root.get(key) == root.get(costs[i][0])) root.put(key, minValue);
        		}
        		root.put(costs[i][0], minValue);
        	}
        	else {
        		root.put(costs[i][1], root.get(costs[i][0]));
        	}
        	
            answer += costs[i][2];
        }
        
        return answer;
    }
}
