package mar;


// charAt() 사용해서 숫자인지 문자인지 판단
// length()사용해서 길이 4 or 6 판단

class 문자열다루기기본 {

    public boolean solution(String s) {
        boolean answer = true;
        int i = 0;
        
        while(i < s.length()){
            
            if(s.length() != 4 && s.length() != 6){
                answer = false;
                break;
            }
            if(s.charAt(i) > 58){
                answer = false;
                break;
            }
            i++;
        }
        return answer;
    }

    /* 다른풀이

    class Solution {
        public boolean solution(String s) {
            if(s.length() == 4 || s.length() == 6){
                try{
                    int x = Integer.parseInt(s);
                    return true;
                } catch(NumberFormatException e){
                    return false;
                }
            }
            else return false;
        }
    }
    */

}