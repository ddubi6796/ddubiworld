package com.test;

import com.test.solution.BruteForce_42839;

public class Main {

	public static void main(String[] args) {
		
		BruteForce_42839 test = new BruteForce_42839();
		
		//해시_완주하지 못한 선수
		//String[] participand = {"mislav", "stanko", "mislav", "ana"};
		//String[] completion = 	{"stanko", "ana", "mislav"};
		//System.out.println(Hash_42576.solution(participand, completion));
		
		//해시_전화번호 목록
		//String[] phone_book = {"119", "97674223", "1195524421"};
		//System.out.println(Hash_42577.solution(phone_book));
		
		//완전탐색_모의고사
		//int[] answers = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		//System.out.println(BruteForce_42840.solution(answers).toString());
		
		//완전탐색_소수 찾기
		String numbers = "011";
		System.out.println(test.solution(numbers));
	}
	

}
