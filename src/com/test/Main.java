package com.test;

import com.test.solution.Greedy_42884;

public class Main {

	public static void main(String[] args) {
		
		Greedy_42884 test = new Greedy_42884();
		
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
		int[][] routes = {{0,1}, {2,3}, {4,5}, {6,7}};
		System.out.println(test.solution(routes));
	}
	

}
