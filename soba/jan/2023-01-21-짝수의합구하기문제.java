public class 짝수의합구하기문제 {

    // 나의 풀이
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 0; i <= n; i++) {

                if ((i + 2) % 2 == 0 && n >= 0 && n <= 1000) {
                    answer = answer + i;
                }

            }
            return answer;
        }
    }

    // 더 간결한 풀이
    class Solution2 {
        public int solution2(int n) {
            int answer = 0;

            for(int i=2; i<=n; i+=2){
                if(n >= 0 && n <= 1000){
                    answer+=i;}
            }

            return answer;
        }
    }





}