package com.test;

import com.test.solution.BruteForce_42839;

public class Main {

	public static void main(String[] args) {
		
		BruteForce_42839 test = new BruteForce_42839();
		
		//�ؽ�_�������� ���� ����
		//String[] participand = {"mislav", "stanko", "mislav", "ana"};
		//String[] completion = 	{"stanko", "ana", "mislav"};
		//System.out.println(Hash_42576.solution(participand, completion));
		
		//�ؽ�_��ȭ��ȣ ���
		//String[] phone_book = {"119", "97674223", "1195524421"};
		//System.out.println(Hash_42577.solution(phone_book));
		
		//����Ž��_���ǰ��
		//int[] answers = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		//System.out.println(BruteForce_42840.solution(answers).toString());
		
		//����Ž��_�Ҽ� ã��
		String numbers = "011";
		System.out.println(test.solution(numbers));
	}
	

}
