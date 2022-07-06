package com.test.solution;

import java.util.HashMap;
import java.util.HashSet;

public class Graph_49191 {
	public int solution(int n, int[][] results) {
        HashMap<Integer, HashSet<Integer>> winMap = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> loseMap = new HashMap<>();
        
        for(int i=0; i<n; i++) {
        	winMap.put(i+1, new HashSet<Integer>());
        	loseMap.put(i+1, new HashSet<Integer>());
        }
        
        for(int i=0; i<results.length; i++) {
        	winMap.get(results[i][0]).add(results[i][1]);
        	loseMap.get(results[i][1]).add(results[i][0]);
        }
        
        // key2->key1 + key1->key3 = key2->key3
        for(Integer key1 : winMap.keySet()) {
        	for(Integer key2 : winMap.keySet()) {
        		for(Integer key3 : winMap.keySet()) {
        			if(winMap.get(key2).contains(key1) && loseMap.get(key3).contains(key1)) {
        				winMap.get(key2).add(key3);
        				loseMap.get(key3).add(key2);
        			}
        		}
        	}
        }
        
        int answer = 0;
        for(Integer key : winMap.keySet()) {
        	if(winMap.get(key).size() + loseMap.get(key).size() == n-1) answer++;
        }
        
        return answer;
    }
	
//	public int solution(int n, int[][] results) {
//        HashMap<Integer, HashSet<Integer>> winMap = new HashMap<>();
//        HashMap<Integer, HashSet<Integer>> loseMap = new HashMap<>();
//        HashMap<Integer, HashSet<Integer>> athMap = new HashMap<>();
//        
//        for(int i=0; i<n; i++) {
//        	winMap.put(i+1, new HashSet<Integer>());
//        	loseMap.put(i+1, new HashSet<Integer>());
//        }
//        
//        for(int i=0; i<results.length; i++) {
//        	winMap.get(results[i][0]).add(results[i][1]);
//        	loseMap.get(results[i][1]).add(results[i][0]);
//        }
//        
//        for(Integer key : winMap.keySet()) {
//        	HashSet<Integer> tmpSet = new HashSet<>();
//        	dfs(n, winMap, key, tmpSet);
//			dfs(n, loseMap, key, tmpSet);
//			athMap.put(key, tmpSet);
//        }
//        
//        int answer = 0;
//        for(Integer key : athMap.keySet()) {
//        	if(athMap.get(key).size() == n-1) answer++;
//        }
//        
//        return answer;
//    }
//	
//	public void dfs(int n, HashMap<Integer, HashSet<Integer>> athMap, int key, HashSet<Integer> subSet) {
//		if(!athMap.get(key).isEmpty()) {
//			for(Integer ath : athMap.get(key)) {
//				subSet.add(ath);
//				dfs(n, athMap, ath, subSet);
//				
//				if(subSet.size() == n) break;
//			}
//		}
//		
//		return;
//	}
}
