//가운데 글자 가져오기
//https://programmers.co.kr/learn/courses/30/lessons/12903

class Solution {
    public String solution(String s) {
        int length = s.length();
        if(length%2!=0){
            return s.substring(length/2,length/2+1);
        } else {
            return s.substring(length/2-1, length/2+1);
        }
    }
}