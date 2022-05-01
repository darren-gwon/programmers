//평균 구하기
//https://programmers.co.kr/learn/courses/30/lessons/12944

class Solution {
    public double solution(int[] arr) {
        int tmp = 0;
        
        for(int i = 0; i<arr.length; i++){
            tmp+=arr[i];
        }
        
        return tmp/(double)arr.length;
    }
}