public class 짝수는싫어요 {

    class Solution {
        public int[] solution(int n) {
            int[] answer = new int [(int)(n+1) / 2];
            int k = 1;

            for(int i = 0; i < ((int)(n+1) /2); i++){

                answer[i] = k;
                k = k + 2;

            }


            return answer;
        }
    }
}
