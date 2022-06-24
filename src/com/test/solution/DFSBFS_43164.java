package com.test.solution;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DFSBFS_43164 {
    PriorityQueue<String> routeQ = new PriorityQueue<>();

	public String[] solution(String[][] tickets) {
        
        for(int i=0; i<tickets.length; i++) {
        	if(tickets[i][0].equals("ICN")) {
        		ArrayList<String> apList = new ArrayList<>();
        		boolean[] visited = new boolean[tickets.length];
        		visited[i] = true;
        		apList.add(tickets[i][0]);
        		
        		findRoute(tickets, apList, tickets[i][1], 1, visited);
        	}
        }
                        
        return routeQ.poll().split(",");
    }
	
	public void findRoute(String[][] tickets, ArrayList<String> apList, String curr, int cnt, boolean[] visited) {
		apList.add(curr);
		
		if(cnt == tickets.length) {
			routeQ.add(String.join(",", apList));
			return;
			
		}else {
			for(int i=0; i<tickets.length; i++) {
	        	if(!visited[i] && tickets[i][0].equals(curr)) {
	        		visited[i] = true;
	        		findRoute(tickets, apList, tickets[i][1], cnt+1, visited);
	        		apList.remove(apList.size()-1);
	        		visited[i] = false;
	        	}
	        }
		}
		
		return;
	}
}
