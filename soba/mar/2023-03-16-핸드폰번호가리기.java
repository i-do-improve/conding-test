class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String star = "";
        
        StringBuilder sb = new StringBuilder(phone_number);

        for(int i = 0; i < phone_number.length()-4; i++){
            star += "*";
        }
        
        answer = sb.replace(0,phone_number.length()-4,star).toString();
    
        return answer;

        /*
        class Solution {
            public String solution(String phone_number) {
                char[] ch = phone_number.toCharArray();
                for(int i = 0; i < ch.length - 4; i ++){
                    ch[i] = '*';
                }
                return String.valueOf(ch);
            }
        }
         */
    }
}