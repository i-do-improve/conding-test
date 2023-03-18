//문제 : 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return
//풀이 : count >= 3이라면 answer++해주는 반복문 안에 n의 약수가 존재하면 count++하는 반복문
class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        //answer++을 위한 반복문
        for (int i = 1; i <= n; i++) {
            
            count=0; //n이하의 수를 전부 확인하기 위해 i가 증감되면 count 리셋
            
            //count++을 위한 반복문
            for (int j = 1; j <= n; j++) {
                if (i % j == 0){count++;}    
            }
            
            if(count >= 3){answer++;}
        }          
        return answer;
    }
}