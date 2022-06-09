package com.test.solution;

import java.util.PriorityQueue;

public class Heap_42626 {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> scovQ = new PriorityQueue<Integer>();	
        for(int scov : scoville) {
        	scovQ.add(scov);
        }
        
        while(scovQ.size() > 1 && scovQ.peek() < K) {
        	int mix = scovQ.poll() + (scovQ.poll() * 2);
        	scovQ.add(mix);
        	answer++;
        }
        
        return (answer < 1 || scovQ.peek() < K) ? -1 : answer;
    }
}
