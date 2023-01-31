//문제 설명
//문자열 my_string이 매개변수로 주어집니다. 
//my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

//my_string의 길이가 i일경우 길이만큼 -1하는 반복문?

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=my_string.length() -1; i>=0; i-- ){
            answer += my_string.substring(i , i+1);
        }
        return answer;
    }
}