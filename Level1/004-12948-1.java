//핸드폰 번호 가리기-1
//https://programmers.co.kr/learn/courses/30/lessons/12948

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String tmp = "";
        for(int i = 0; i<phone_number.length()-4; i++){
            tmp+="*";
        }
        answer = tmp+phone_number.substring(phone_number.length()-4);
        return answer;
    }
}