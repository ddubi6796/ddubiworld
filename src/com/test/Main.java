package com.test;

import com.test.solution.Greedy_42883;

public class Main {

	public static void main(String[] args) {
		
		Greedy_42883 test = new Greedy_42883();
		
		//�ؽ�_�������� ���� ����
		//String[] participand = {"mislav", "stanko", "mislav", "ana"};
		//String[] completion = {"stanko", "ana", "mislav"};
		//System.out.println(Hash_42576.solution(participand, completion));
		
		//�ؽ�_��ȭ��ȣ ���
		//String[] phone_book = {"119", "97674223", "1195524421"};
		//System.out.println(Hash_42577.solution(phone_book));
		
		//�ؽ�_����
		//String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
		//System.out.println(solution(clothes));

		//�ؽ�_����Ʈ�ٹ�
		//String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		//int[] plays = {500, 600, 150, 800, 2500};
		//System.out.println(Hash_42579.solution(genres, plays).toString());
		
		//����/ť_������
		//int[] priorities = {1, 1, 9, 1, 1, 1};
		//int location = 0;
		//System.out.println(StackQueue_42587.solution(priorities, location));
		
		//����/ť �ٸ��� ������ Ʈ��
		//int bridge_length = 100;
		//int weight = 100;
		//int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};		
		//System.out.println(StackQueue_42583.solution(bridge_length, weight, truck_weights));
		
		//����/ť_�ֽİ���
		//int[] prices = {1, 2, 3, 2, 3};
		//System.out.println(StackQueue_42584.solution(prices));
		
		//��_�� �ʰ�
		//int[] scoville = {1, 2, 3, 9, 10, 12};
		//int K = 7;
		//System.out.println(Heap_42626.solution(scoville, K));
		
		//��_��ũ ��Ʈ�ѷ�
		//int[][] jobs = {{24, 10}, {28, 39}, {43, 20}, {37, 5}, {47, 22}, {20, 47}, {15, 34}, {15, 2}, {35, 43}, {26, 1}};	
		//System.out.println(Heap_42627.solution(jobs));
		
		//��_���߿켱����ť
		//String[] operations = {"I 7","I 5","I -5","D -1"};	
		//System.out.println(Heap_42628.solution(operations).toString());
		
		//����_K��°��
		//int[] array = {1, 5, 2, 6, 3, 7, 4};	
		//int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		//System.out.println(Sort_42748.solution(array, commands));
		
		//����_���� ū ��
		//int[] numbers = {0,0,0,0};	
		//System.out.println(Sort_42746.solution(numbers));
		
		//����_H-Index
		//int[] citations = {22,42};	
		//System.out.println(Sort_42747.solution(citations));
		
		//����Ž��_���ǰ��
		//int[] answers = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		//System.out.println(BruteForce_42840.solution(answers).toString());
		
		//����Ž��_�Ҽ� ã��
		//String numbers = "011";
		//System.out.println(test.solution(numbers));
		
		//Ž���(Greedy)_���̽�ƽ
		//String name = "JEROEN";
		//System.out.println(test.solution(name));

		//Ž���(Greedy)_ū �� �����
		String number = "1924";
		int k = 2;
		System.out.println(test.solution(number, k));
	}
	

}
