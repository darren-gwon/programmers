//나누어 떨어지는 숫자 배열
//https://programmers.co.kr/learn/courses/30/lessons/12910

class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        
        String tmp = s.toLowerCase();
        if(s.length()>50)
            return false;

        for(int i = 0; i<s.length(); i++){
            if(tmp.charAt(i)=='y'){
                yCnt++;
            } else if(tmp.charAt(i)=='p'){
                pCnt++;
            }
        }

        return pCnt==yCnt;
    }
}