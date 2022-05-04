//자릿수 더하기
//https://programmers.co.kr/learn/courses/30/lessons/12931

class Solution {
    public int[] solution(long n) {
        String tmp = ""+n;
        
        int[] intArr = new int[tmp.length()];
        
        for(int i = tmp.length()-1, j=0; i>=0; i-- ){
            intArr[j++] = tmp.charAt(i)-'0';
        }
        
        return intArr;
    }
}