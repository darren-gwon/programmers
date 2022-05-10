//시저 암호
//https://programmers.co.kr/learn/courses/30/lessons/12926

class Solution {
    public String solution(String s, int n) {
        char[] chArr = s.toCharArray();

        for(int i = 0; i<chArr.length; i++){
            if(chArr[i]==' ')
                continue;
            
                for (int j = 0; j<n; j++){
                    char tmp = chArr[i];
                    if(tmp=='z' || tmp=='Z'){
                        chArr[i]=(char)(tmp-25);
                        continue;
                    } 
                    
                    chArr[i]++;
                }
            }
        
        return new String(chArr);
    }
}