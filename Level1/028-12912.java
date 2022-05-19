//두 정수 사이의 합
//https://programmers.co.kr/learn/courses/30/lessons/12912

class Solution {
    public long solution(int a, int b) {
        if(a>b){
            int tmp = b;
            b = a;
            a = tmp;
        }

        long sum = 0;
        for(int i=a; i<=b; i++){
            sum+=i;
        }
        
        return sum;
    }
}