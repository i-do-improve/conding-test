package feb;


/* String 메소드인 replace와 StringBuilder 메소드 setCharAt의 차이

replace의 첫번째 매개변수는 변환하고자 하는 대상이 될 문자열 , 두번째 매개변수는 변환할 문자 값
ex) replace("a", "b") "a"가 "b" 로 변환됨

setCharAt(int, char)의 첫번째 매개변수는 변환하고자 하는 대상이 되는 인덱스 번호 , 두번째 매개변수는 변환할 문자 값 (char형)
setCharAt(0, 'a') 0번째 요소가 a로 변환됨

*/

class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        
        String answer;
        StringBuilder sb = new StringBuilder(my_string);
        char a = my_string.charAt(num1);
        char b = my_string.charAt(num2);
        
        sb.setCharAt(num1, b);
        sb.setCharAt(num2, a);
        answer = sb.toString();


        return answer;
    }
}