package mar;

// 하나하나 빼야해 그럴려면? string형으로 바꿔야지
// + ""; 를 사용하면 쉽게 int -> string으로 바꿀수잇다는 것을 배운적이잇다


class 칠의개수 {
    public int solution(int[] array) {
        int answer = 0;
        String tmp = "";
        
        for(int a : array){
            tmp += a+"";
        }
        
        for(int i = 0; i < tmp.length(); i++){
            if(tmp.charAt(i) == '7'){
                answer++;
            }
        }
        // 위에서 '7'이 아니라 7 + 48 로 하면 아스키 코드로 풀 수 있다.
        return answer;
    }
}