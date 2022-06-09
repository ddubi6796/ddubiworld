package com.test.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BruteForce_42840 {
    public static int[] solution(int[] answers) {
        List<Integer> supo1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> supo2 = Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5); 
        List<Integer> supo3 = Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5);
        
        //점수 구하기
        List<Integer> cntSupo = Arrays.asList(0,0,0);  
        for(int i=0; i<answers.length; i++) {
        	int idx = i>0 ? Math.floorMod(i, supo1.size()) : 0;
        	if(answers[i] == supo1.get(idx)) {
        		cntSupo.set(0, cntSupo.get(0)+1);
        	}

        	idx = i>0 ? Math.floorMod(i, supo2.size()) : 0;
        	if(answers[i] == supo2.get(idx)) {
        		cntSupo.set(1, cntSupo.get(1)+1);
        	}

        	idx = i>0 ? Math.floorMod(i, supo3.size()) : 0;
        	if(answers[i] == supo3.get(idx)) {
        		cntSupo.set(2, cntSupo.get(2)+1);
        	} 	
        }
        
        //가장 많이 맞힌 수포자 리스트 생성
        List<Integer> maxList = new ArrayList<>();
        int max = Collections.max(cntSupo);
        for(int i=0; i<cntSupo.size(); i++) {
        	if(max == cntSupo.get(i)) maxList.add(i+1);
        }
        
        //int 배열로 리턴
        int[] result = new int[maxList.size()];
        for(int i=0; i<maxList.size(); i++) {
        	result[i] = maxList.get(i);
        }

        return result;
    }
}
