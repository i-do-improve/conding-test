//문자열 my_string이 매개변수로 주어집니다. 
//my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

////"1"~"9"의 원소를 가진 문자열 배열을 생성하여 my_string과 contains로 비교 


class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String [] str = {"1","2","3","4","5","6","7","8","9"};
        
        for (String s : str) {
            if (my_string.contains(s)) {
                answer += Integer.parseInt(s);
            }
        }
           
        return answer;
    }
}