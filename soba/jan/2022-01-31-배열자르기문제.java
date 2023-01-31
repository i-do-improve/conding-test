import java.util.Arrays;

public class 배열자르기문제 {

    class Solution1 {
        public int[] solution1(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2 - num1 + 1];

            for (int i = 0; i < (num2 - num1 + 1); i++) {
                answer[i] = numbers[num1 + i];
            }

            return answer;
        }
    }

    // Arrays.copyOfRange() 를 이용해주면 굉장히 편리하다
    class Solution2 {
         public int[] solution2(int[] numbers, int num1, int num2) {
            return Arrays.copyOfRange(numbers, num1, num2 + 1);
            }
        }
}