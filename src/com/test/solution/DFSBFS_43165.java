package com.test.solution;

public class DFSBFS_43165 {
    private int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }
    
    private void dfs(int[] numbers, int depth, int target, int sum){
        //끝까지 탐색한 경우
        if(depth == numbers.length){
            if(sum == target) answer++; 
            
        }else{
            dfs(numbers, depth+1, target, sum-numbers[depth]);
            dfs(numbers, depth+1, target, sum+numbers[depth]);
        }
    }
}
