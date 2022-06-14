package com.test.solution;

import java.util.Arrays;
import java.util.Collections;

public class Greedy_42883 {
    public String solution(String number, int k) {    
    	String answer = "";
    	String[] numArr = number.split("");
    	
    	Arrays.sort(numArr, Collections.reverseOrder());
	
    	int cnt = k;
    	while(cnt > 0 && answer.length() < numArr.length-k) {
        	for(int i=0; i<numArr.length; i++) {
        		int offset = number.indexOf(numArr[i]);
        		if(cnt >= offset && offset >= 0) {
        			answer += number.charAt(offset);
        			number = number.substring(offset+1, number.length());
        			cnt = cnt - offset;
        			break;
        		}
        	}
    	}
    	
    	if(cnt > 0)	return answer;
    	
        return answer + number;

    }
}
