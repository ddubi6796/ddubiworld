package com.test.solution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class StackQueue_42587 {
	
	public static int solution(int[] priorities, int location) {
		int answer = 0;
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());		
		Queue<Integer> printQueue = new LinkedList<>();
		Queue<Integer> idQueue = new LinkedList<>();
		
        for(int i=0; i<priorities.length; i++) {
        	priorityQueue.add(priorities[i]);
        	printQueue.add(priorities[i]);
        	idQueue.add(i);
        }
                
        int cnt = 1;
        while(!printQueue.isEmpty()) {        	
        	//���� �켱������ ���� ���� ���Ͽ� Ŭ ��쿡�� �����
        	if(printQueue.peek() >= priorityQueue.peek()) {
            	//��û ���� ���
            	if(idQueue.peek().equals(location)) {
            		answer = cnt;
            		break;
            	}
            	
        		printQueue.poll();
        		idQueue.poll();
        		priorityQueue.poll();
        		cnt++;
        		
    		//�������� �߰�
        	}else{
        		printQueue.add(printQueue.poll());	
        		idQueue.add(idQueue.poll());
        	}
        }
        
		return answer;
    }
}
