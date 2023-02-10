public class 암호해독 {

    /*배수를 활용 ex) 3*1 3*2 3*3 ..
.length()를 활용, -1 해줘야함
for문사용

*/

    class Solution1 {
        public String solution1(String cipher, int code) {
            StringBuilder answer = new StringBuilder();
            int length = cipher.length() / code;

            for (int i = 1; i <= length; i++) {
                answer.append(cipher.charAt(code * i - 1));
            }
            return answer.toString();
        }
    }

    class Solution2{
        public String solution2(String cipher, int code) {
            StringBuilder answer = new StringBuilder();
            int length = cipher.length() / code;

            // 증감식에 i = i + code를 넣어 풀어줄 수도 있다
            for(int i = code; i <= cipher.length(); i = i + code){
                answer.append(cipher.charAt(i - 1));
            }
            return answer.toString();
        }
    }
