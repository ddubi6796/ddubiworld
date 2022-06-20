package com.test.solution;

import java.util.Arrays;

public class DP_42897 {
	
	//{1000, 2, 3, 500, 4, 0, 2000, 4000}; // 4500
	// 1000 500 2000
	// 500 4000
	
	public int solution(int[] money) {
        int[] moneyH = Arrays.copyOfRange(money, 0, money.length-1);
        int[] moneyT = Arrays.copyOfRange(money, 1, money.length);
        
        moneyH[1] = Math.max(moneyH[0], moneyH[1]);
        moneyT[1] = Math.max(moneyT[0], moneyT[1]);
        for(int i=2; i<money.length-1; i++) {
        	moneyH[i] = Math.max(moneyH[i-1], moneyH[i-2]+moneyH[i]);
        	moneyT[i] = Math.max(moneyT[i-1], moneyT[i-2]+moneyT[i]);
        }

        return Math.max(moneyH[moneyH.length-1], moneyT[moneyT.length-1]);
    }
}
