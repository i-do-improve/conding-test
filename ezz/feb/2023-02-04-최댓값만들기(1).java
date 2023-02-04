//정수 배열 numbers가 매개변수로 주어집니다. 
//numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.


//numbers_len은 배열 numbers의 길이입니다.
//numbers 원소 중 두 개의 곱 중 최댓값을 return
//numbers 오름차순 정렬
//numbers 최댓값 numbers[n-1],두번째 최댓값 numbers[n-2]의 곱 return
import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int n=numbers.length;
        
        Arrays.sort(numbers);
        
        answer = numbers[n-1] * numbers[n-2];
        return answer;
    }
}