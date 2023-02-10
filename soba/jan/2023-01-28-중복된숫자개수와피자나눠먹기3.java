public class 중복된숫자개수와피자나눠먹기3 {

    class Solution1 {
        public int solution1(int[] array, int n) {
            int answer = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] == n){
                    answer++;
                }
            }
            return answer;
        }
    }

    // n / slice 가 정수형태로 나눠떨어질 때와 실수형태로 나눠떨어질 때로 구분하는 것이 중요
    class Solution2 {
        public int solution2(int slice, int n) {


            if (n % slice == 0){
                return n / slice;
            }else
                return (int)((n / slice) + 1);

        }
    }






}
