//부족한 금액 계산하기
//https://programmers.co.kr/learn/courses/30/lessons/82612

class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        
        for(int i = 1; i<=count; i++){
            sum+=((long)price*i);
        }
        
        return (money-sum)>=0 ? 0:(money-sum)*-1;
    }
}