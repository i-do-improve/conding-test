package mar;

class 콜라츠추측 {
    public int solution(int num) {
        int answer = 0;
        
        for(int i = 0; i < 500; i++){
            if(num % 2 == 0){
                num = num / 2;
            }else if(num == 1){
                break;
            }else if(num % 2 ==1){
                num = num * 3 + 1;
            }else if(i == 499){
                answer = -1;
                break;
            }answer++;
        }
        return answer;
    }
}