package com.test.solution;

import java.util.Arrays;
import java.util.Comparator;

public class Sort_42746 {
    public static String solution(int[] numbers) {
        String answer = "";
        String[] strArr = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	strArr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strArr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(Integer.valueOf(o1+o2) < Integer.valueOf(o2+o1)) return 1;
				if(Integer.valueOf(o1+o2) > Integer.valueOf(o2+o1)) return -1;

				return 0;
			}
        });
        
        for(String str : strArr) {
    		answer += str;
            
            if(answer.startsWith("0")){
            	answer = answer.substring(1);
            }
        }
    
        return answer.isEmpty() ? "0" : answer;
    }
}
