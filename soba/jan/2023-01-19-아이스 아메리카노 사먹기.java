class Solution {
        public int[] solution(int money) {

            int coffee = 0;
            int change = 0;

            while(true){
                if(money < 5500){
                    break;
                }

                coffee++;
                money -= 5500;

            }

            change = money % 5500;

            int [] answer = {coffee, change};

            return answer;
        }
    }
}
