//문자열을 정수로 바꾸기
//https://programmers.co.kr/learn/courses/30/lessons/12925

import java.lang.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.contains("-")){
            answer = Integer.parseInt(s.substring(1))*-1;
        } else if(s.contains("+")){
            answer = Integer.parseInt(s.substring(1));
        } else 
            answer = Integer.parseInt(s);
        
        return answer;
    }
}