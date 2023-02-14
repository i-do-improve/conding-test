//문제 설명
//문자열 my_string과 문자 letter이 매개변수로 주어집니다. 
//my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.


//문자열에서 특정문자만 제거하기
//String.replace() 사용 (루프 내의 문자열에서 각 문자의 모든 발생을 제거하는 메서드)
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
         for (char c : letter.toCharArray()) {
            answer = my_string.replace(String.valueOf(c), "");
        }
        
        return answer;
    }
}