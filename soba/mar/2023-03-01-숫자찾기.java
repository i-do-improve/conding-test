package mar;

class 숫자찾기 {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str = String.valueOf(num);
        String val = String.valueOf(k);
        int i = 0;
        
        while(true){
            
            if(str.charAt(i) == val.charAt(0)){
                answer = i + 1;
                break;
            }else if(i == str.length() - 1){
                answer = -1;
                break;
            }i++;
        }
        return answer;


        /* 다른 풀이

        class Solution {
            public int solution(int num, int k) {
                String numStr = String.valueOf(num);
                String kStr = String.valueOf(k);

                int answer = numStr.indexOf(kStr); indexof("찾고자하는 문자)는 입력된 매개변수가 위치한 인덱스 번호를 반환해 준다
                return answer < 0 ? -1 : answer + 1 ;
            }
        }
        */
    }
}