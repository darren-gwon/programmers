//자연수 뒤집어 배열로 만들기
//https://programmers.co.kr/learn/courses/30/lessons/12932

class Solution {
    public int[] solution(long n) {
        String tmp = ""+n;
        int idx = 0;
        int[] intArr = new int[tmp.length()];
        
        while(n>0){
            intArr[idx++] = (int)(n%10);
            n/=10;
        }
        
        return intArr;
    }
}