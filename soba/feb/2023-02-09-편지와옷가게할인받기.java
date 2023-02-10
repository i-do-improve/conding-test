public class 편지와옷가게할인받기 {

    // 편지
    class Solution1 {
        public int solution1(String message) {

            return message.length() * 2;
        }
    }

    // 옷가게
    class Solution2 {
        public int solution2(int price) {
            double answer = 0;

            if(price >= 500000){
                answer = price - (price * 0.2);
            }else if(price >= 300000){
                answer = price - (price * 0.1);
            }else if(price >= 100000){
                answer = price - (price * 0.05);
            }else
                answer = price;

            return (int)answer;
        }
    }

}