//문제 설명
//문자열 my_string과 정수 n이 매개변수로 주어질 때, 
//my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.


//my_string배열의 요소들인 각 문자를 n만큼 반복
//반복될 해당 문자열을 charAt()로 추출하여 return
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
               
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++) { 
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}
