//수박수박수박수박수박수?
//https://programmers.co.kr/learn/courses/30/lessons/12922

class Solution {
    public String solution(int n) {
        StringBuffer sb= new StringBuffer();
        String watermelon = "수박";
        
        if(n%2!=0){
            for (int i=0; i<n/2; i++){
                sb.append(watermelon);
            }
            sb.append(watermelon.substring(0,1));
        } else {
            for (int i=0; i<n/2; i++){
                sb.append(watermelon);
            }
        }

        return sb.toString();
    }
}