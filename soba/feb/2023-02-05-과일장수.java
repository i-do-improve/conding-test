import java.util.Arrays;



class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int i = 1;
        
        Arrays.sort(score);
        
        while(true){
            if(score.length - i * m < 0){ //score[] 인덱스가 -로 갈때 break로 에러를 방지
                break;
            }
            answer += score[score.length - i * m] * m;
            i = i + 1;
            }
        return answer;
    }
}