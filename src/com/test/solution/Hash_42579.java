package com.test.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Hash_42579 {
	//베스트앨범
		public static List<Integer> solution(String[] genres, int[] plays) {
			List<Integer> answer = new ArrayList<>();
	        HashMap<String, Integer> genreMap = new HashMap<>();

	        //1-1. 장르별 {고유번호, 재생횟수} 맵 생성
	        HashMap<String, HashMap> genrePlayMap = new HashMap<>();	
	        for(int i=0; i<genres.length; i++) {
	        	HashMap<Integer, Integer> tempMap = new HashMap<>();
	        	tempMap.put(i, plays[i]);
	        	if(genrePlayMap.containsKey(genres[i])) {
	            	tempMap.putAll((Map<Integer, Integer>) genrePlayMap.get(genres[i]));
	        	}
	        	genrePlayMap.put(genres[i], tempMap);
	        }
	        //1-2. 재생횟수로 고유번호 정렬
	        HashMap<String, List> sortedGenrePlayMap = new HashMap<>();	
	        for(String key : genrePlayMap.keySet()) {       	
	            List<Map.Entry<Integer, Integer>> genrePlayList = new LinkedList<>(genrePlayMap.get(key).entrySet());
	            genrePlayList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
		          	public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
		          		return o2.getValue() - o1.getValue();
		          	}
		        });
	            List<Integer> idList = new ArrayList<>();
	            for(int i=0; i<(genrePlayList.size()>2?2:genrePlayList.size()); i++) {
	            	idList.add(genrePlayList.get(i).getKey());
	            }
	            sortedGenrePlayMap.put(key, idList);
	        }
	        
	        //2-1. 장르별 재생횟수 맵 생성
	        for(int i=0; i<genres.length; i++) {
	        	if(genreMap.containsKey(genres[i])) {
	            	genreMap.put(genres[i], genreMap.get(genres[i]) + plays[i]);
	        	}else {
	            	genreMap.put(genres[i], plays[i]);
	        	}
	        }
	        
	        //2-2. 재생횟수로 장르 정렬
	        List<Map.Entry<String, Integer>> sortedGenreList = new LinkedList<>(genreMap.entrySet());
	        //sortedGenreList.sort(Map.Entry.comparingByValue());	// 오름차순 정렬
	        sortedGenreList.sort(new Comparator<Map.Entry<String, Integer>>() {
	        	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	        		return o2.getValue() - o1.getValue();
	        	}
	        });        
	        
	        //3. 장르, 재생횟수 순으로 정렬된 고유 번호 리스트 생성
	        for(Map.Entry<String, Integer> m : sortedGenreList) {
	        	answer.addAll(sortedGenrePlayMap.get(m.getKey()));
	        }
	        
	        return answer;
	    }
}
