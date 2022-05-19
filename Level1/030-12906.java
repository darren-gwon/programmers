//같은 숫자는 싫어
//https://programmers.co.kr/learn/courses/30/lessons/12906

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        int tmp = arr[0];
        list.add(tmp);
        
        for(int i = 0; i<arr.length-1; i++){
            if(tmp==arr[i+1]){
                continue;
            } else {
                tmp = arr[i+1];
                list.add(arr[i+1]);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}