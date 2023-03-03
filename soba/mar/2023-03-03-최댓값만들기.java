package mar;

import java.util.Arrays;

class 최댓값만들기 {
    public int solution(int[] numbers) {
        int answer = 0;
        int i = numbers.length;
        
        Arrays.sort(numbers);
        
        return answer = Math.max(numbers[0]*numbers[1], numbers[i - 2] * numbers[i - 1]);
    }
}