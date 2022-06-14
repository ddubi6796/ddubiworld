package com.test.solution;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class Greedy_42883 {
    public String solution(String number, int k) {    
    	String answer = "";
    	String[] numArr = number.split("");
    	
    	Arrays.sort(numArr, Collections.reverseOrder());
    	
//    	for(int i=0; i<k; i++) {
//    		number = number.replaceFirst(numArr[i], "");
//    	}
    	
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
    	
//        for(int i=0; i<k; i++) {
//        	BigInteger answer = new BigInteger("0");
//        	for(int j=0; j<number.length(); j++) {
//        		String tempStr = number.substring(0, j) + number.substring(j+1, number.length());
//        		BigInteger tempInt = new BigInteger(tempStr);
//        		
//        		answer = answer.compareTo(tempInt) > 0 ? answer : tempInt;
//        	}
//        	number = String.format("%0"+String.valueOf(number.length()-1)+"d", answer);
//        }
        
    	if(cnt > 0)	return answer;
    	
        return answer + number;

    }
}
