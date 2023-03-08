//문제 : my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return
//풀이 : toLowerCase() (->소문자로 변환), Sort()(->순서 정렬)를 사용하여 변환하고 return
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        char[] arrChar = my_string.toLowerCase().toCharArray();
                
        Arrays.sort(arrChar);
        
        String answer = new String(arrChar);
        
        return answer;
    }
}