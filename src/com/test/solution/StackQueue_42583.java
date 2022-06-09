package com.test.solution;

import java.util.LinkedList;
import java.util.Queue;

import com.test.vo.Truck;

public class StackQueue_42583 {
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        Queue<Truck> truckQ = new LinkedList<>();
        Queue<Truck> bridgeQ = new LinkedList<>();
        
        for(int w : truck_weights) {
        	truckQ.add(new Truck(w, 1));
        }
        
        int currW = truckQ.peek().getWeight();
        int currL = truckQ.peek().getLength();
        bridgeQ.add(truckQ.poll());
        
        while(!truckQ.isEmpty() || !bridgeQ.isEmpty()) {  
            Queue<Truck> deleteQ = new LinkedList<>();
        	
        	for(Truck truck : bridgeQ) {
        		if(truck.getLength() == bridge_length) {
        			currL -= 1;
        			currW -= truck.getWeight();
        			deleteQ.add(truck);
        		}else {
        			truck.setLength(truck.getLength()+1);
        		}
        	}
        	for(Truck truck : deleteQ) {
        		bridgeQ.remove(truck);
        	}

        	if(!truckQ.isEmpty()) {
            	if(truckQ.peek().getWeight() + currW <= weight && currL <= bridge_length ) {
            		currW += truckQ.peek().getWeight();
            		currL += truckQ.peek().getLength();
            		bridgeQ.add(truckQ.poll());
            	}
        	} 
        	answer++;
        }
        
        return answer;
    }
}
