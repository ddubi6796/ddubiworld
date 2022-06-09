package com.test.solution;

import java.util.Collections;
import java.util.PriorityQueue;

//{"I 16","D 1"}
public class Heap_42628 {
    public static int[] solution(String[] operations) {
        int[] answer = {0, 0};
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        
        for(String op : operations) {
        	String operator = op.split(" ")[0];
        	String operand = op.split(" ")[1];
        	
        	if(operator.equals("I")) {
        		maxQueue.add(Integer.valueOf(operand));
        		minQueue.add(Integer.valueOf(operand));
        	}
        	if(operator.equals("D")) {
        		if(operand.equals("1"))	minQueue.remove(maxQueue.poll());
        		else maxQueue.remove(minQueue.poll());
        	}
        }
        if(maxQueue.size() > 0) {
        	answer[0] = maxQueue.poll();
        	answer[1] = minQueue.poll();
        }
        
        return answer;
    }
}
