package feb;

import java.util.Arrays;


public class 문자열정리하기1 {

    class Solution {
        public int[] solution(String my_string) {

            int index = 0;
            StringBuffer str = new StringBuffer();

            for (int i = 0; i < my_string.length(); i++) {
                if ((int) my_string.charAt(i) <= 57) {
                    str.append(my_string.charAt(i));
                    index++;
                }
            }

            int[] answer = new int[index];

            for (int i = 0; i < index; i++) {
                answer[i] = str.charAt(i) - 48;
            }
            Arrays.sort(answer);
            return answer;
        }
    }


    // .replaceAll() 을 이용한 풀이


    class Solution2 {
        public int[] solution2(String my_string) {

            my_string = my_string.replaceAll("[a-z]", "");

            int[] answer = new int[my_string.length()];

            for (int i = 0; i < my_string.length(); i++) {
                answer[i] = my_string.charAt(i) - '0'; //'0' 은 아스키코드로 48을 의미, 따라서 -48을 해주는 효과와 같다
            }

            Arrays.sort(answer);

            return answer;
        }
    }
}