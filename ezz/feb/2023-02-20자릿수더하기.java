//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

//while문을 사용하여 자릿수의 숫자만 꺼내서 합
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //조건식이 true->문장 실행, false -> 종료
          while(true){
            answer+=n%10;
            if(n<10) break;//n이 10보다 작아질 때 까지 n을 10으로 나눈 후 나머지를 aswer 합
            
            n=n/10; //n은 n을 10으로 나눈 몫
        }
        return answer;
    }
    
}
    