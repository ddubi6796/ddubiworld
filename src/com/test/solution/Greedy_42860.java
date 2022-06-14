package com.test.solution;

public class Greedy_42860 {
    public int solution(String name) {
        char[] nameArr = name.toCharArray();
        
        int Ud = 0;
        int Lr = name.length()-1;
        
        for(int i=0; i<name.length(); i++) {
        	//»óÇÏ
        	Ud += Math.min( nameArr[i]-65, 90-nameArr[i]+1 );
        	
        	//ÁÂ¿ì
        	int aIdx = i+1;
        	while(aIdx < name.length() && nameArr[aIdx] == 65) {
        		aIdx++;
        	}
        	Lr = Math.min( Lr, Math.min((i*2+(name.length()-aIdx)), (name.length()-aIdx)*2+i) );
        }
        
    	return Ud + Lr;
    }
}
