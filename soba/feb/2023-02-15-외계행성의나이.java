public class 외계행성의나이 {

    /*
    숫자를 문자로 치환
    a=0 b=1 c=2 d=3 e=4 f=5 g=6 h=7 i=8 j=9
    일단은 숫자를 쪼갤까?

    아니다 이것은 아스키 코드를 활용해 푸는 문제이다
    아스키코드에서 0은 48 a는 97이다
    따라서 아스키코드로 변환 후 48에 +49를 해주면 문제가 원하는대로
    0123456789 -> abcdefghij 로 정확히 변환된다.

    가위바위보 문제에서 charAt()를 int형으로 변환했다가 아스키코드가 나왔던 경험을 활용
    */

    class Solution {
        public String solution(int age) {
            // append기능을 사용해주기 위해 StringBuilder를 사용
            StringBuilder answer = new StringBuilder();
            // length를 구하기 위해 str 형으로 변환
            String str = String.valueOf(age);

            for (int i = 0; i < str.length(); i++) {
                // 아스키코드로 변환하 변수 ascii에 담아줌
                int ascii = str.charAt(i);
                // ascii에 49를 더해서 문자로 바꿔준 후 다시 char형으로 변환
                char chr = (char) (ascii + 49);
                answer.append(chr);
            }

            return answer.toString();
        }
    }
}