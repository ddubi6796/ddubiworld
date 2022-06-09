package com.test.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hash_42577 {
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        List<Integer> indexList = new ArrayList<>();
        
        Arrays.sort(phone_book);
        
        indexList.add(0);
        for(int i=0 ; i<phone_book.length-1; i++) {
        	indexList.add(indexList.get(i) + phone_book[i].length());
        }
        
        for(int i=0 ; i<phone_book.length; i++) {
        	String[] tempArr = phone_book.clone();
        	tempArr[i] = "";
            String phonebookStr = String.join("", tempArr);
        	int idx = phonebookStr.indexOf(phone_book[i]);
        	
        	if(idx > indexList.get(i)) idx = idx + phone_book[i].length();
        	
            if(indexList.contains(idx)) {
            	answer = false;
            	break;
            }
        }
        
		return answer;
    }
}
