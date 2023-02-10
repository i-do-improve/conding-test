public class 머쓱이보다키큰사람문제 {

    class Solution1 {
        public int solution1(int[] array, int height) {
            int answer = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] > height){
                    answer++;
                }
            }
            return answer;
        }
    }

    class Solution2 {
        public int solution2(int[] array, int height) {
            int answer = 0;
            for(int i = 0; i < array.length; i++){
                answer += array[i] > height ? 1 : 0;
            }
            return answer;
        }
    }


}
