public class 개미군단 {

    class Solution1 {
        public int solution1(int hp) {
            int answer = 0;
            int A = 0;
            int B = 0;
            int C = 0;

            A = hp / 5;
            hp = hp - (A * 5);
            B = hp / 3;
            hp = hp - (B * 3);
            C = hp / 1;

            return A + B + C;
        }
    }

    // 우효 한 줄로 축소 시킬 수 있다.
    class Solution2 {
        public int solution2(int hp) {
            return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
        }
    }






}
