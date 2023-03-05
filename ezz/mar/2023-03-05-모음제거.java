//문자열 my_string에서 a, e, i, o, u 를 제거 후 return
////replaceAll를 사용하여 ""로 변환 후 answer에 리턴

class Solution {
    public String solution(String my_string) {
    String answer = "";
            answer = my_string.replaceAll("[aeiou]","");                     
    return answer;
    }
}