package com.test.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BruteForce_42839 {
	
	Set<Integer> numberSet = new HashSet<>();
	
    public int solution(String numbers) {
        String[] numberArr = numbers.split("");
        List<String> numberStrArr = Arrays.asList(numberArr);

        makeNumberSet(numberStrArr, 0, "");
        
        int cnt = 0;
        for(int num : numberSet) {
        	if(isPrime(num)) cnt++;
        }
        
        return cnt;
    }
    
    public void makeNumberSet(List<String> numberStrArr, int depth, String num){        
    	if(numberStrArr.isEmpty())	return;
    	
    	for(int i=0; i<numberStrArr.size(); i++) {   		
			numberSet.add(Integer.parseInt(num + numberStrArr.get(i)));
			
    		List<String> newArr = new ArrayList<>();
    		newArr.addAll(numberStrArr);
			newArr.remove(i);
			makeNumberSet(newArr, depth+1, (num + numberStrArr.get(i)));
    	}
    	
    }
    
    public boolean isPrime(int num) {
    	for(int i=2; i<=num/2; i++) {
    		if(num%i == 0)	return false;
    	}
		return num >= 2;
    }
}
