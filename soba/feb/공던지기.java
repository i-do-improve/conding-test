public class 공던지기 {

    // 틀린 풀이

    class Solution1 {
        public int solution1(int[] numbers, int k) {
            int answer = 1;

            for(int i = 0; i < k-1; i++){
                answer += 2;

                if(answer > numbers.length){
                    answer = 1;
                }else if(answer == numbers.length){
                    answer = 0;
                }
            }
            return answer;
        }
    }

    // 맞는 풀이
    class Solution2 {
        public int solution2(int[] numbers, int k) {
            return numbers[2 * (k - 1) % numbers.length];
        }
    }


}
