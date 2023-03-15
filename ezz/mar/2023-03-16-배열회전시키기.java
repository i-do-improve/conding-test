//문제 : 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return
//풀이 : left일 경우 배열 numbers의 원소까지 i++ 반목문 이용하여 i+1로 위치이동
//      right일 경우 numbers.length부터 0까지 i-- 반목문 이용하여 i-1로 위치이동
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("left")){
            for(int i=0; i<numbers.length-1; i++){
                answer[i] += numbers[i+1];
            }
            answer[numbers.length-1] =numbers[0]; //마지막은 직접 지정하여 위치이동
            
        } else if(direction.equals("right")){
            for(int i=numbers.length-1; i>0; i--){
                answer[i] += numbers[i-1];
            }
            answer[0] =numbers[numbers.length-1]; //마지막은 직접 지정하여 위치이동
        }
        return answer;
    }
}