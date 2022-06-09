package com.test.solution;

import java.util.Arrays;
import java.util.Collections;

public class Sort_42747 {
    public static int solution(int[] citations) {
        Integer[] sortedArr = new Integer[citations.length];
        for(int i=0; i<citations.length; i++) {
        	sortedArr[i] = citations[i];
        }
        
        Arrays.sort(sortedArr, Collections.reverseOrder());
        
        int answer = 0;
        for(int i=0; i<sortedArr.length; i++) {
        	if(sortedArr.length < sortedArr[sortedArr.length-1]) {
        		answer = sortedArr.length;
        		break;
        	}
        	if((i+1) <= sortedArr[i]) {
            	answer = sortedArr[i];
        	}else {
        		answer = i;
        		break;
        	}
        }
        
        return answer;
    }
}
