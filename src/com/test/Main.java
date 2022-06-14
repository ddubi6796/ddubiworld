package com.test;

import com.test.solution.Greedy_42883;

public class Main {

	public static void main(String[] args) {
		
		Greedy_42883 test = new Greedy_42883();
		
		//해시_완주하지 못한 선수
		//String[] participand = {"mislav", "stanko", "mislav", "ana"};
		//String[] completion = {"stanko", "ana", "mislav"};
		//System.out.println(Hash_42576.solution(participand, completion));
		
		//해시_전화번호 목록
		//String[] phone_book = {"119", "97674223", "1195524421"};
		//System.out.println(Hash_42577.solution(phone_book));
		
		//해시_위장
		//String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
		//System.out.println(solution(clothes));

		//해시_베스트앨범
		//String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		//int[] plays = {500, 600, 150, 800, 2500};
		//System.out.println(Hash_42579.solution(genres, plays).toString());
		
		//스택/큐_프린터
		//int[] priorities = {1, 1, 9, 1, 1, 1};
		//int location = 0;
		//System.out.println(StackQueue_42587.solution(priorities, location));
		
		//스택/큐 다리를 지나는 트럭
		//int bridge_length = 100;
		//int weight = 100;
		//int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};		
		//System.out.println(StackQueue_42583.solution(bridge_length, weight, truck_weights));
		
		//스택/큐_주식가격
		//int[] prices = {1, 2, 3, 2, 3};
		//System.out.println(StackQueue_42584.solution(prices));
		
		//힙_더 맵게
		//int[] scoville = {1, 2, 3, 9, 10, 12};
		//int K = 7;
		//System.out.println(Heap_42626.solution(scoville, K));
		
		//힙_디스크 컨트롤러
		//int[][] jobs = {{24, 10}, {28, 39}, {43, 20}, {37, 5}, {47, 22}, {20, 47}, {15, 34}, {15, 2}, {35, 43}, {26, 1}};	
		//System.out.println(Heap_42627.solution(jobs));
		
		//힙_이중우선순위큐
		//String[] operations = {"I 7","I 5","I -5","D -1"};	
		//System.out.println(Heap_42628.solution(operations).toString());
		
		//정렬_K번째수
		//int[] array = {1, 5, 2, 6, 3, 7, 4};	
		//int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		//System.out.println(Sort_42748.solution(array, commands));
		
		//정렬_가장 큰 수
		//int[] numbers = {0,0,0,0};	
		//System.out.println(Sort_42746.solution(numbers));
		
		//정렬_H-Index
		//int[] citations = {22,42};	
		//System.out.println(Sort_42747.solution(citations));
		
		//완전탐색_모의고사
		//int[] answers = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		//System.out.println(BruteForce_42840.solution(answers).toString());
		
		//완전탐색_소수 찾기
		//String numbers = "011";
		//System.out.println(test.solution(numbers));
		
		//탐욕법(Greedy)_조이스틱
		//String name = "JEROEN";
		//System.out.println(test.solution(name));

		//탐욕법(Greedy)_큰 수 만들기
		String number = "1924";
		int k = 2;
		System.out.println(test.solution(number, k));
	}
	

}
