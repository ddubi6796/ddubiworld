package com.test.solution;

import java.util.Arrays;

public class BinarySearch_43236 {
	public int solution(int distance, int[] rocks, int n) {        	
		int start = 0;
        int end = distance;
        int res = distance / 2;
        
		int[] rocksArr = Arrays.copyOf(rocks, rocks.length+1);
		rocksArr[rocks.length] = distance;
		
        Arrays.sort(rocksArr);
        
        while(start <= end) {
        	int mid = (end + start) / 2;
        	int removed = getRemoved(mid, rocksArr);
        	
        	if(removed <= n) {
        		start = mid + 1;
        		res = mid;
        	}else { 				 
        		end = mid - 1;
        	}
        }
        
        return res;
    }
	
	public int getRemoved(int mid, int[] rocks) {
		int cnt = 0;
		int prev = 0;
		
		for(int i=0; i<rocks.length; i++) {
			if(rocks[i] - prev < mid) cnt++;
			else prev = rocks[i];
		}
		
		return cnt;
	}
}
