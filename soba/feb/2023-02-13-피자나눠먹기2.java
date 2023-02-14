public class 피자나눠먹기2 {

    /* n과 6의 최소공배수를 묻는 문제

     */

    class Solution {
        public int solution(int n) {

            int answer = 0;
            int i = n;

            while(true){

                if(n % 6 != 0){
                    n = n + i;
                }else if(n % 6 == 0){
                    answer = n / 6;
                    break;
                }
            }

            return answer;
        }
    }
}
