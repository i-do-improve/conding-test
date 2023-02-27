package feb;

class 모음제거 {
    public String solution(String my_string) {
        String answer = my_string;
        answer = answer.replaceAll("[aeiou]","");
        
        return answer;
    }
}