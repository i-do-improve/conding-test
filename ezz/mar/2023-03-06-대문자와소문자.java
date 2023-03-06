//대문자는 소문자로 소문자는 대문자로 변환하여 리턴

//-> String 에서 제공되는 대소문자 변환 메서드를 이용하여 리턴
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char ch =my_string.charAt(i);
            String str =String.valueOf(ch);
            
            if(Character.isUpperCase(my_string.charAt(i))){ //대문자인경우
                answer+=str.toLowerCase();                
            }else {
                answer+=str.toUpperCase();        
            }
        }             
        return answer;
    }
}