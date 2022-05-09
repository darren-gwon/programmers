//이상한 문자 만들기
//https://programmers.co.kr/learn/courses/30/lessons/12930

class Solution {
    public String solution(String s) {
        char[] chArr = s.toCharArray();
        int idx = 0;
        
        for (int i = 0; i<chArr.length; i++){
            char tmp = chArr[i];

            if(!('A' <= tmp && tmp <= 'Z')){
                if((idx == 0 || idx%2==0)){
                    chArr[i]=(char)(chArr[i]-32);
                }
            } else {
                if(idx%2!=0){
                    chArr[i]=(char)(chArr[i]+32);
                }
            }
            
            idx++;
            
            if(tmp == ' '){
                chArr[i]=' ';
                idx=0;
            }
        }
        return new String(chArr);
    }
}