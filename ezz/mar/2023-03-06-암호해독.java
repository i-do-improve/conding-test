// 문자열 cipher에서 code의 배수 번째 글자만 return

////-> code의 배수 번째 글자인 조건에만 return하는 반복문

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i=0; i<cipher.length(); i++){
            if( (i+1) % code == 0){
                answer += cipher.charAt(i);
            }
        }
        return answer;
    }
}
