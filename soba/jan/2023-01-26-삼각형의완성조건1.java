import java.util.Arrays;

public class 삼각형의완성조건1 {

    class Solution1 {
        public int solution1(int[] sides) {

            int answer = 0;

            Arrays.sort(sides);

            if(sides[2] < sides[0] + sides[1]){
                answer = 1;
            }else {
                answer = 2;
            }
            return answer;
        }


        // 삼항연산자를 이용하면 더욱 간단

        class Solution2 {
            public int solution2(int[] sides) {
                int answer = 0;
                Arrays.sort(sides);
                return sides[2] >= sides[0]+sides[1] ? 2 : 1;
            }
        }


    }


}
