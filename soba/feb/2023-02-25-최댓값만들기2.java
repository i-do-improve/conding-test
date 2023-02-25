package feb;

import java.util.Arrays;

class 최댓값만들기2 {
    public int solution(int[] numbers) {
        int[] arr = new int[numbers.length];
        int answer = numbers[0] * numbers[1];
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 1; j < numbers.length; j++){
                
                if(answer < numbers[i] * numbers[j] && i != j){
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }

    class Solution2 {
        public int solution2(int[] numbers) {
            int len = numbers.length;
            Arrays.sort(numbers);
            return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
            // 작은수부터 큰수까지 정렬한 다음 0 * 1번째 요소 와 len - 1 * len - 2의 수 중 큰 걸 출력해주면 됨
        }
    }





}