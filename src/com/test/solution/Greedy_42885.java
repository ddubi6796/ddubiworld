package com.test.solution;

import java.util.Arrays;

public class Greedy_42885 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int pivot = people.length;
        
        Arrays.sort(people);
        
    	for(int i=0; i<pivot; i++) {
    		boolean matched = false;
    		
            for(int j=pivot-1; j>i; j--) {
            	
                if(people[i] + people[j] <= limit) {
                    answer += pivot-j;
                    pivot = j;
                    matched = true;
                    break;
                }
            }
            if(!matched) {
            	answer += pivot-i;
            	break;
            }
    	}
    	        
        return answer;
    }
}
