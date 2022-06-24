package com.test;

import com.test.solution.BinarySearch_43236;

public class Main {

	public static void main(String[] args) {
		
		BinarySearch_43236 test = new BinarySearch_43236();
		
		//해시_완주하지 못한 선수 Hash_42576
		//String[] participand = {"mislav", "stanko", "mislav", "ana"};
		//String[] completion = {"stanko", "ana", "mislav"};
		//System.out.println(test.solution(participand, completion));
		
		//해시_전화번호 목록 Hash_42577
		//String[] phone_book = {"119", "97674223", "1195524421"};
		//System.out.println(test.solution(phone_book));
		
		//해시_위장 Hash_42578
		//String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
		//System.out.println(test.solution(clothes));

		//해시_베스트앨범 Hash_42579
		//String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		//int[] plays = {500, 600, 150, 800, 2500};
		//System.out.println(test.solution(genres, plays).toString());
		
		//스택/큐_프린터 StackQueue_42587
		//int[] priorities = {1, 1, 9, 1, 1, 1};
		//int location = 0;
		//System.out.println(test.solution(priorities, location));
		
		//스택/큐 다리를 지나는 트럭 StackQueue_42583
		//int bridge_length = 100;
		//int weight = 100;
		//int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};		
		//System.out.println(test.solution(bridge_length, weight, truck_weights));
		
		//스택/큐_주식가격 StackQueue_42584
		//int[] prices = {1, 2, 3, 2, 3};
		//System.out.println(test.solution(prices));
		
		//힙_더 맵게 Heap_42626
		//int[] scoville = {1, 2, 3, 9, 10, 12};
		//int K = 7;
		//System.out.println(test.solution(scoville, K));
		
		//힙_디스크 컨트롤러 Heap_42627
		//int[][] jobs = {{24, 10}, {28, 39}, {43, 20}, {37, 5}, {47, 22}, {20, 47}, {15, 34}, {15, 2}, {35, 43}, {26, 1}};	
		//System.out.println(test.solution(jobs));
		
		//힙_이중우선순위큐 Heap_42628
		//String[] operations = {"I 7","I 5","I -5","D -1"};	
		//System.out.println(test.solution(operations).toString());
		
		//정렬_K번째수 Sort_42748
		//int[] array = {1, 5, 2, 6, 3, 7, 4};	
		//int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		//System.out.println(test.solution(array, commands));
		
		//정렬_가장 큰 수 Sort_42746
		//int[] numbers = {0,0,0,0};	
		//System.out.println(test.solution(numbers));
		
		//정렬_H-Index Sort_42747
		//int[] citations = {22,42};	
		//System.out.println(test.solution(citations));
		
		//완전탐색_모의고사 BruteForce_42840
		//int[] answers = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		//System.out.println(test.solution(answers).toString());
		
		//완전탐색_소수 찾기 BruteForce_42839
		//String numbers = "011";
		//System.out.println(test.solution(numbers));
		
		//탐욕법(Greedy)_조이스틱 Greedy_42860
		//String name = "JEROEN";
		//System.out.println(test.solution(name));

		//탐욕법(Greedy)_큰 수 만들기 Greedy_42883
		//String number = "1924";
		//int k = 2;
		//System.out.println(test.solution(number, k));
		
		//탐욕법(Greedy)_구명보트 Greedy_42885
		//int[] people = {50,50,50,50,50};
		//int limit = 100;
		//System.out.println(test.solution(people, limit));
		
		//탐욕법(Greedy)_섬 연결하기 Greedy_42861
		//int n = 5;
		//int[][] costs = {{2,3,7},{3,6,13},{3,5,23},{5,6,25},{0,1,29},{1,5,34},{1,2,35},{4,5,53},{0,4,75}}; //159
		//int[][] costs = {{0, 1, 1}, {2, 3, 1}, {3, 4, 2}, {1, 2, 2}, {0, 4, 100}}; //6
		//int[][] costs = {{0,1,5},{1,2,3},{2,3,3},{3,1,2},{3,0,4},{2,4,6},{4,0,7}}; //15
		//int[][] costs = { {10,11,1},{11,300,1},{10,5,2},{11,5,5},{5,300,8} }; //4
		//int[][] costs = {{0,1,1},{0,2,2},{2,3,1}};
		//int[][] costs = {{0, 1, 5}, {1, 2, 3}, {2, 3, 3}, {3, 1, 2}, {3, 0, 4}};
		//int[][] costs = {{0, 1, 1}, {3, 1, 1}, {0, 2, 2}, {0, 3, 2}, {0, 4, 100}};
		//System.out.println(test.solution(n, costs));
		
		//탐욕법(Greedy)_단속카메라 Greedy_42884
		//int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
		//int[][] routes = {{0,1}, {2,3}, {4,5}, {6,7}};
		//System.out.println(test.solution(routes));
		
		//동적계획법(Dynamic Programming)_N으로 표현 DP_42895
		//int N = 5;
		//int number = 12;
		//System.out.println(test.solution(N, number));
		
		//동적계획법(Dynamic Programming)_정수 삼각형 DP_43105
		//int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		//System.out.println(test.solution(triangle));
		
		//동적계획법(Dynamic Programming)_등굣길 DP_42898
		//int m = 5;
		//int n = 3; 
		//int[][] puddles = {{2,2}, {3,3}, {4,1}};
		//System.out.println(test.solution(m, n, puddles));
		
		//동적계획법(Dynamic Programming)_도둑질 DP_42897
		//int[] money = {1000, 2, 3, 500, 4, 0, 2000, 4000}; // 4502
		//int[] money = {0, 0, 4, 5, 4};	// 8
		//System.out.println(test.solution(money));
		
		//깊이/너비 우선 탐색(DFS/BFS)_타겟 넘버 DFSBFS_43165
		//int[] numbers = {1, 1, 1, 1, 1};
		//int target = 3; // 5
		//System.out.println(test.solution(numbers, target));
		
		//깊이/너비 우선 탐색(DFS/BFS)_네트워크 DFSBFS_43162
		//int n = 4;
		//int[][] computers = {{1, 0, 0, 0}, {0, 1, 0, 1}, {0, 1, 1, 0}, {1, 0, 0, 1}}; // 1
		//System.out.println(test.solution(n, computers));
		
		//깊이/너비 우선 탐색(DFS/BFS)_단어 변환 DFSBFS_43163
		//String begin = "hit";
		//String target = "cog";
		//String[] words = {"hot", "dot", "dog", "lot", "log", "cog"}; // 4
		//System.out.println(test.solution(begin, target, words));
		
		//깊이/너비 우선 탐색(DFS/BFS)_여행경로 DFSBFS_43164		
		//String[][] tickets = {{"ICN","A"}, {"A","C"}, {"A","D"}, {"D","B"}, {"B","A"}};
		//String[][] tickets = {{"B", "ICN"}, {"ICN", "A"}, {"ICN", "B"}, {"A", "B"}, {"B", "ICN"}};  // ["ICN", "A", "B", "ICN", "B", "ICN"]
		//String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}}; // ["ICN", "JFK", "HND", "IAD"]
		//String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}}; // ["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]
		//System.out.println(test.solution(tickets).toString());
		
		//이분탐색_입국심사 BinarySearch_43238
		//int n = 6;
		//int[] times = {7, 10};	//15
		//System.out.println(test.solution(n, times));
		
		//이분탐색_징검다리 BinarySearch_43236
		int distance = 25;
		int[] rocks = {2, 14, 11, 21, 17};
		int n = 2;	//4
		System.out.println(test.solution(distance, rocks, n));
	}
	

}
