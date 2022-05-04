//자릿수 더하기
//https://programmers.co.kr/learn/courses/30/lessons/12931

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String tmp = ""+n;
        
        for(int i = 0; i<tmp.length(); i++){
            answer += tmp.charAt(i)-'0';
        }
        
        return answer;
    }
}