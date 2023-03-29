package mar;

class JadenCase문자열만들기 {
        public String solution(String s) {
            StringBuilder sb = new StringBuilder();
            String[] arr = s.toLowerCase().split("");
            boolean bool = true;

            for(String str : arr){
                if(bool){
                    sb.append(str.toUpperCase());
                }else{
                    sb.append(str);
                }
                    
                if(str.equals(" ")){
                    bool = true;
                }else{
                    bool = false;
                }
            }
            return sb.toString();
    }

    /*
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] sp = s.toLowerCase().split("");
            boolean flag = true;

            for(String ss : sp) {
                answer += flag ? ss.toUpperCase() : ss;
                flag = ss.equals(" ") ? true : false;
            }

            return answer;
        }

    }
     */
}