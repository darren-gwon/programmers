//문자열 내림차순으로 배치하기
//https://programmers.co.kr/learn/courses/30/lessons/12917

import java.util.*;
class Solution {
    public String solution(String s) {
        char[] chArr = s.toCharArray();

        for(int i = 0; i<chArr.length; i++){
            for(int j=i+1;j<chArr.length; j++){
                if(chArr[i]<chArr[j]){
                    char tmp = chArr[i];
                    chArr[i] = chArr[j];
                    chArr[j] = tmp;
                }
            }
        }
        return new String(chArr);
    }
}