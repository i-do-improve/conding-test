//문자열 str1, str2가 매개변수로 주어집니다. 
//str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

//문자열 str1안에 str2가 있다면 1을 없다면 2를 return
////-> if조건문을 사용 조건식은 contains으로 들어있는지 확인
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)){
            return 1;
        }else {
            answer= 2;
        }return answer;
    }
}