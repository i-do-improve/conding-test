package feb;

/*복습 : 0은 아스키 코드로 48, a는 아스키코드로 97 둘은 49차이
그럼 대문자 A는 ?? ->  65이다.
따라서 소문자와 대문자의 아스키 코드상 차이는 32이
이것을 활용해 주자.
*/

class 대문자와소문자 {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        
        for(int i = 0; i < my_string.length(); i++){
            int ascii = my_string.charAt(i);
            
            if(ascii < 91){
                char small = (char)(ascii + 32);
                answer.append(small);
        
            }else{
                char large = (char)(ascii - 32);
                answer.append(large);
            }
                
            
        }
        
        
        
        return answer.toString();
    }
}