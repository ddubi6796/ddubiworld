package com.test.solution;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DFSBFS_43164 {
	public String[] solution(String[][] tickets) {
        PriorityQueue<String> routeQ = new PriorityQueue<>();
        
        for(int i=0; i<tickets.length; i++) {
        	if(tickets[i][0].equals("ICN")) {
        		ArrayList<String> apList = new ArrayList<>();
        		boolean[] visited = new boolean[tickets.length];
        		visited[i] = true;
        		apList.add(tickets[i][0]);
        		
        		routeQ.add(findRoute(tickets, apList, tickets[i][1], 1, visited));
        	}
        }
                
        return routeQ.poll().split(", ");
    }
	
	public String findRoute(String[][] tickets, ArrayList<String> apList, String curr, int cnt, boolean[] visited) {
		apList.add(curr);
		if(cnt == tickets.length) {
			String apStr = apList.toString();
			return apStr.substring(1, apStr.length()-1);
			
		}else {
			for(int i=0; i<tickets.length; i++) {
	        	if(!visited[i] && tickets[i][0].equals(curr)) {
	        		visited[i] = true;
	        		return findRoute(tickets, apList, tickets[i][1], cnt+1, visited);
	        	}
	        }
		}
		
		return "";
	}
}
