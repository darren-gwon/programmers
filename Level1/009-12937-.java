//짝수와 홀수
//https://programmers.co.kr/learn/courses/30/lessons/12937

class Solution {
    public int solution(int num) {
        return (int)recursive(num, 1);
    }
    
    public double recursive(double num, int cnt) {
        if (num==1)
            return 0;
        
        if (cnt>=500)
            return -1;
        
        num = num%2==0 ? num/(double)2 : (num*3)+1;
        
        if(num<=1)
            return cnt;
        else{
            return recursive(num, ++cnt);
        }
    }
}