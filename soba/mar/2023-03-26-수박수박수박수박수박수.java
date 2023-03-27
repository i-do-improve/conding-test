package mar;// for문, if 홀수 = 수 짝수 = 박 나오게 하면 되지 않을까?

class 수박수박수박수박수박수 {
    public String solution(int n) {
        String answer = "";
        
        for(int i = 0; i < n ; i++){
            if(i % 2 == 0){
                answer += "수";
            }else if(i % 2 == 1){
                answer += "박";
            }
        }
        
        return answer;
    }
}