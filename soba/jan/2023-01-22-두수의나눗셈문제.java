class Solution {
        public int solution(int num1, int num2) {
            double answer = 0;

            if(num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100){
                answer = (double) num1 / num2;
                answer = answer * 1000;

            }

            return (int) answer;
        }
}

