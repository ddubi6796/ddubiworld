package com.test.solution;

import java.util.HashMap;

public class Hash_42576 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> cnt = new HashMap<>();
		
		for(String key : participant) {
			if(cnt.containsKey(key)) {
				cnt.put(key, cnt.get(key) + 1);
			}else {
				cnt.put(key, 1);
			}
		}
		for(String key : completion) {
			cnt.put(key, cnt.get(key) - 1);
		}
		for(String key : cnt.keySet()) {
			if(cnt.get(key) > 0) {
				return answer = key;
			}
		}
		return answer;
    }
}
