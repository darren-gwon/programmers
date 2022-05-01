//핸드폰 번호 가리기-2
//https://programmers.co.kr/learn/courses/30/lessons/12948

import java.util.Arrays;

class Solution {
    public String solution(String phone_number) {      
        char[] numberCharArr = phone_number.toCharArray();

        for(int i = 0; i<phone_number.length()-4; i++){
            numberCharArr[i]='*';
        }
        
        return String.valueOf(numberCharArr);
    }
}