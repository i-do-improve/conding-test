//문제 : numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return
//풀이 : numbers의 원소를 정렬하여 곱의 값이 가장 크게 나오는 원소들
//(0과 가장 차이가 큰 원소인 양 끝의 원소 두 개)을 곱한 후 비교하여 return
import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0, answer2 = 0; 
        int num=numbers.length;
        
        Arrays.sort(numbers);
        
        answer=numbers[0] * numbers[1];
        answer2=numbers[num-1] * numbers[num-2];
        
        if(answer < answer2){return answer2;} 
        else{return answer;}        
    }
}