public class 각도기문제 {

    // if 의 기본적인 이해를 요구하는 문제.
    class Solution {
        public int solution(int angle) {
            int answer = 0;

            if(angle > 0 && angle < 90){
                answer = 1;
            }
            else if(angle == 90){
                answer = 2;
            }
            else if(angle > 90 && angle < 180){
                answer = 3;
            }
            else if(angle == 180){
                answer = 4;
            }

            return answer;
        }
    }
}




public class 피자나눠먹기1 {

    // 피자의 조각은 7개이고 최소 n 명의 사람이 피자를 하나 씩 먹으려면 피자는 몇판이 필요한가는 결국
    // n / 7 에서 나오는 값에서 올림을 해주면 되는 문제
    // 올림을 어떻게 처리해야 하는가에 관한 이해도를 묻는 문제이다
    class Solution {
        public int solution(int n) {
            int answer = 0;

            if(n % 7 == 0){
                answer = n / 7;
            }
            else{
                answer = (int)((n / 7) + 1);
            }
            return answer;
        }
    }
}
