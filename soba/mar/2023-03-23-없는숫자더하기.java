package mar;

import java.util.Arrays;

/*
배열값과 1~9까지의 수를 비교
answer += 1~9 중에 없는 수
*/

class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] oneToNine = {0,1,2,3,4,5,6,7,8,9};
        Arrays.sort(numbers);

        int[] tmp = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        
        for(int i = 0; i < numbers.length; i++){
            tmp[numbers[i]] = numbers[i];
        }
        // numbers = [5,8,4,0,6,7,9] 라면
        // tmp = [0,-1,-1,-1,4,5,6,7,8,9];
        
        for(int j = 0; j < tmp.length; j++){
            if(tmp[j] != oneToNine[j]){
                answer += oneToNine[j];
            }
        }
        return answer;
    }

    ///// 밑에는 다른 풀이들

    /*
    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            int[] sum = {0,1,2,3,4,5,6,7,8,9};

            for(int i = 0; i< sum.length; i++){
                for(int j=0; j< numbers.length; j++){
                    if(sum[i] == numbers[j]){
                        sum[i] -= numbers[j];
                    }
                }
                answer += sum[i];
            }
            return answer;
        }

     */

    /*

    class Solution {
        public int solution(int[] numbers) {
            int sum = 45;
            for (int i : numbers) {
                sum -= i;
            }
            return sum;
        }
    }
    */

}