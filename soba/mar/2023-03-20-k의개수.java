package mar;

class k의개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int n = i; n <= j; n++){
            sb.append(String.valueOf(n));
        }
        
        for(int n = 0; n < sb.length(); n++ ){
            if(sb.charAt(n) == k + 48 ){
                answer++;
            }
        }
        return answer;
    }

    // int 형에 + ""를 해주면 String형으로 변환된다

    /*
    class 다른풀이 {
        public int solution(int i, int j, int k) {
            String str = "";
            for(int a = i; a <= j; a++) {
                str += a+"";
            }

            return str.length() - str.replace(k+"", "").length();
        }
    */

    }





}