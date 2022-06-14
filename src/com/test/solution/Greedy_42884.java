package com.test.solution;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Greedy_42884 {
    public int solution(int[][] routes) {        
        PriorityQueue<int[]> routeQ = new PriorityQueue<>(new Comparator<int[]>() {
												@Override
												public int compare(int[] o1, int[] o2) {
													return o1[1] - o2[1];
												}
									        });
        for(int[] route : routes) {
        	routeQ.add(route);
        }
        
        int cam = routeQ.poll()[1];
        int answer = 1;
        while(routeQ.size() > 0) {
        	if(routeQ.peek()[0] <= cam) {
        		routeQ.poll();
        	}else {
        		cam = routeQ.poll()[1];
        		answer++;
        	}
        }
        
        return answer;
    }
}
