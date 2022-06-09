package com.test.solution;

import java.util.HashMap;

public class Hash_42578 {
	
	//¿ß¿Â
	public  int solution(String[][] clothes) {
		HashMap<String, Integer> clothesMap = new HashMap<>();
	    
	    for(String[] c : clothes) {
	    	if(clothesMap.containsKey(c[1])) {
	        	clothesMap.put(c[1], clothesMap.get(c[1]) + 1);
	    	}else {
	        	clothesMap.put(c[1], 1);
	    	}
	    }
	    
	    int cnt = 1;
	    for(String key : clothesMap.keySet()) {
	    	cnt = cnt * (clothesMap.get(key)+1);
	    }
	    
	    return cnt - 1;
	}
}
