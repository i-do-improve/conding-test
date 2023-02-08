//문제 설명
//정수 n이 매개변수로 주어질 때, 
//n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

//n 이하의 홀수를 answer[]에 리턴

class Solution {
    public int[] solution(int n) {
        int[] answer = new int [(n+1)/2]; //홀수만
                        //n 이하까지만
        for(int i=1; i<=n; i++){
            if(i%2==1){//홀수일 때
              answer[i/2] += i;  
            }            
       }        
        return answer;
    }
}