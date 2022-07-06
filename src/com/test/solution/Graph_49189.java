package com.test.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_49189 {
			
	public int solution(int n, int[][] edge) {
		HashMap<Integer, ArrayList<Integer>> vMap = new HashMap<>();
		Boolean[] visited = new Boolean[n+1];

		for(int i=0; i<=n; i++) {
			visited[i] = false;
			vMap.put(i, new ArrayList<>());
		}
		for(int i=0; i<edge.length; i++) {
			vMap.get(edge[i][0]).add(edge[i][1]);
			vMap.get(edge[i][1]).add(edge[i][0]);
		}
	
		return bfs(vMap, visited);
	}
	
	public int bfs(HashMap<Integer, ArrayList<Integer>> vMap, Boolean[] visited) {
		
		Queue<Integer> vertexQ = new LinkedList<>();
		vertexQ.add(1);
		visited[1] = true;
		
		int cnt = 0;
		while(true) {
			Queue<Integer> tempQ = new LinkedList<>();

			while(!vertexQ.isEmpty()) {
				int vertex = vertexQ.poll();
				
				for(int v : vMap.get(vertex)) {
					if(!visited[v]) {
						tempQ.add(v);
						visited[v] = true;
					}
				}
			}	
			
			if(tempQ.isEmpty()) return cnt;
			
			vertexQ.addAll(tempQ);
			cnt = tempQ.size();
		}		
	}
	
	
/********************************************************************************	
 ** DFS 초과 **********************************************************************
 ********************************************************************************/	
	
//	public int solution(int n, int[][] edge) {
//		HashMap<Integer, ArrayList<Integer>> vMap = new HashMap<>();
//		Integer[] vertex = new Integer[n+1];
//		
//		for(int i=0; i<=n; i++) {
//			vMap.put(i, new ArrayList<>());
//			vertex[i] = i > 1 ? n : 0;
//		}
//		for(int i=0; i<edge.length; i++) {
//			vMap.get(edge[i][0]).add(edge[i][1]);
//			vMap.get(edge[i][1]).add(edge[i][0]);
//		}
//		
//		for(int i=0; i<vMap.get(1).size(); i++) {
//			ArrayList<Integer> visited = new ArrayList<>();
//			visited.addAll(vMap.get(1));
//			dfs(vMap, vMap.get(1).get(i), 1, visited, vertex);
//		}
//		
//		List<Integer> vertextList = Arrays.asList(vertex);
//		int max = Collections.max(vertextList);
//		
//		return Collections.frequency(vertextList, max);
//	}
//	
//	public void dfs(HashMap<Integer, ArrayList<Integer>> vMap, int dest, int depth, ArrayList<Integer> visited, Integer[] vertex) {
//		if(depth < vertex[dest]) {
//			vertex[dest] = depth;
//		}else {
//			return;	// 최단 거리가 아님.
//		}
//		
//		ArrayList<Integer> destList = vMap.get(dest);
//		for(int i=0; i<destList.size(); i++) {
//			int next = destList.get(i);
//			if(!visited.contains(next)) {
//				visited.addAll(destList);
//				dfs(vMap, next, depth+1, visited, vertex);
//				visited.removeAll(destList);
//			}
//		}
//	}
}
