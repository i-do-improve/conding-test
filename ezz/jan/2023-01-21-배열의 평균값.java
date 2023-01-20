//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
//0 ≤ numbers의 원소 ≤ 1,000
//1 ≤ numbers의 길이 ≤ 100
//정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

class Solution {
    public double solution(int[] numbers) {
        double answer = 0; 
        double tot = 0; //총합계
        //총합을 구하는 반복문
        for(int i=0; i<numbers.length; i++){
            tot += numbers[i]; 
        }
        //평균값
        answer=tot / numbers.length;
        return answer;        
    }
}