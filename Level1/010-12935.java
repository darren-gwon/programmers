//https://programmers.co.kr/learn/courses/30/lessons/12935
//제일 작은 수 제거하기

import java.lang.Math;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length<=1)
            return new int[] {-1};
        
        int min = arr[0];
        
        for(int i = 0 ; i<arr.length-1; i++){
            min = Math.min(min, arr[i+1]);
        }
        
        int[] answer = new int[arr.length-1];
        
        for(int i=0, j=0; i<arr.length;i++){
            if(arr[i]!=min)
                answer[j++]=arr[i];
        }
        
        return answer;
    }
}