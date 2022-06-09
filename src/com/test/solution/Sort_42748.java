package com.test.solution;

import java.util.PriorityQueue;

//int[] array = {1, 5, 2, 6, 3, 7, 4};	
//int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
public class Sort_42748 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int c=0; c<commands.length; c++) {
            PriorityQueue<Integer> pQueue = new PriorityQueue<>();
            for(int i=commands[c][0]-1; i<commands[c][1]; i++) {
            	pQueue.add(array[i]);
            }	
            
            for(int i=0; i<commands[c][2]; i++) {
            	answer[c] = pQueue.poll();
            }
        }
        
        return answer;
    }
}
