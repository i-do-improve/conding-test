//문제 : 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return
//풀이 : 팩토리얼을 구하는 함수를 이용하여 10 이하의 팩토리얼을 n과 비교하여 n이하의 최대 팩토리얼을 return
class Solution {
    //팩토리얼을 구하는 함수
    public int Factorial(int answer) {
        if (answer == 1) {
            return 1;
        }
        return answer * Factorial(answer - 1);
    }
    //n이하의 최대 팩토리얼을 구하는 함수
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i<=10; i++){
            if(n>=Factorial(i)){
                answer=i;
            }            
        }
        return answer;
    }
}
