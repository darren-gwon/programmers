//최소직사각형
//https://programmers.co.kr/learn/courses/30/lessons/86491

import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0 ; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1])  {    
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }
        int width = sizes[0][0];
        for(int i = 1; i<sizes.length; i++){
            width = Math.max(width, sizes[i][0]);
        }
        
        int height = sizes[0][1];
        for(int i = 1; i<sizes.length; i++){
            height = Math.max(height, sizes[i][1]);
        }
        
        return width*height;
    }
}