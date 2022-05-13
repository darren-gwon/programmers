//문자열 다루기 기본
//https://programmers.co.kr/learn/courses/30/lessons/12918

class Solution {
    public boolean solution(String s) {

        String lowerCase = s.toLowerCase();

        if(s.length()==4 || s.length()==6){
            for(int i=0;i<lowerCase.length();i++){
                char tmp = lowerCase.charAt(i);
                if('a' <=tmp && tmp <= 'z'){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}