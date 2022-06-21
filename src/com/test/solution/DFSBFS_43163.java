package com.test.solution;

import java.util.Arrays;

public class DFSBFS_43163 {

	public int solution(String begin, String target, String[] words) {
		int answer = words.length+1;
        boolean[] visited = new boolean[words.length];
        
        if(!Arrays.asList(words).contains(target)) return 0;
        
        for(int i=0; i<words.length; i++) {
        	if(matchWord(begin, words[i])) {
        		visited[i] = true;
                answer = Math.min(answer, findTarget(words[i], target, words, visited, 1));
        	}
        }
        
        return answer > words.length ? 0 : answer;
    }
	
	public int findTarget(String begin, String target, String[] words, boolean[] visited, int depth) {				
		int answer = 0;
		if(begin.equals(target)) {
			return depth;
			
		}else {
			for(int i=0; i<words.length; i++) {
				if(!visited[i] && matchWord(begin, words[i])) {
					visited[i] = true;
					answer = findTarget(words[i], target, words, visited, depth+1);
					visited[i] = false;
				}
			}
		}
		
		return answer;
	}
	
	public boolean matchWord(String s1, String s2) {
		int cnt = 0;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) == s2.charAt(i)) cnt++;
		}
		
		return cnt == s1.length()-1;
	}
}
