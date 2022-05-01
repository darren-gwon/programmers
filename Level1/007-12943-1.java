//콜라츠 추측-1
//https://programmers.co.kr/learn/courses/30/lessons/12943

class Solution {
    public int solution(int num) {
        int cnt = 0;
        double tmp = num;
        
        while(tmp!=1){
            cnt++;
            
            if(cnt>=500){
                return -1;
            }
            
            if(tmp%2==0){
                tmp/=(double)2;
            } else {
                tmp = (tmp*3)+1;
            }
            
        }
                
        return cnt;
    }
}