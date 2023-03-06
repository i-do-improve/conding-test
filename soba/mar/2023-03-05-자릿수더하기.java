package mar;

public class 자릿수더하기 {
    public int solution(int n) {

        String str = String.valueOf(n);
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - 48;
        }
        return answer;
    }

    /*
    다른풀이 , % 를 이용한 방법

    public class Solution2 {
        public int solution2(int n) {
            int answer = 0;

            while (n != 0) {
                answer += n % 10;
                n /= 10;
            }

            return answer;
        }
        */
}