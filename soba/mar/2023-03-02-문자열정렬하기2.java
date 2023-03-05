package mar;

import java.util.Arrays;

//아스키코드, casting, 확장for문 등 많은 것이 사용..

class 문자열정렬하기2 {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++){
            if((int)my_string.charAt(i) < 97){
                char chr = (char)(my_string.charAt(i) + 32);
                sb = sb.append(chr);
            }else{
                sb = sb.append(my_string.charAt(i));
            }
        }
        
        String str = sb.toString();
        String[] arr = str.split("");
        Arrays.sort(arr);
        
        for(String s : arr){
            answer = answer.append(s);
        }
        return answer.toString();


        // 다른 풀이
        // toLowerCase()를 이용해 소문자로 바꿔준 후 , toCharArray()로 char형 배열로 변환
        class Solution2 {
            public String solution2(String my_string) {
                char[] c = my_string.toLowerCase().toCharArray();
                Arrays.sort(c);
                return new String(c);
            }
        }
    }
}