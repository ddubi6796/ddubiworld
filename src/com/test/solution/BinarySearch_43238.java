package com.test.solution;

import java.util.Arrays;

public class BinarySearch_43238 {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long fastest = (long) times[0];
        
        long start = fastest;
        long end = n * fastest;
        long min_time = n * fastest;
        long checked = 0;
        
        while(start <= end) {
        	long mid = (start + end) / 2;
        	checked = 0;
        	
        	for(int i=0; i<times.length; i++) {
        		checked += mid / times[i];
        		
        		if(checked >= n) {
        			min_time = mid;
        			end = mid - 1;
        			break;
        		}
        	}
        	
        	if(checked < n) start = mid + 1;
        }
        
        return min_time;
       
    }
}
