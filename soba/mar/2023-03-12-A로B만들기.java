package mar;

import java.util.Arrays;

class A로B만들기 {
    public int solution(String before, String after) {
        
        int answer = 0;
        
        char[] tmp1 = before.toCharArray();
        char[] tmp2 = after.toCharArray();
        
        Arrays.sort(tmp1);
        Arrays.sort(tmp2);

        /*
        String str1 = String.valueOf(tmp1);
        String str2 = String.valueOf(tmp2);
        */

        String str1 = Arrays.toString(tmp1);
        String str2 = Arrays.toString(tmp2);
        
        if(str1.equals(str2)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}