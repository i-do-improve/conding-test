//정수가 담긴 리스트 num_list가 주어질 때, 
//num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.


class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; //2개의 정수를 가진 answer배열 선언을 위해
        int x=0;
        int y=0;
                //배열의 원소를 모두 비교하기위한 반복문
        for( int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){ //짝수일 경우
                x++;
            }else{//짝수가 아닐 경우
                y++;
            }
        }
        
        answer[0] = x;//배열의 첫번째 위치는 x
        answer[1] = y;//배열의 두번째 위치는 y
        return answer;
    }
}