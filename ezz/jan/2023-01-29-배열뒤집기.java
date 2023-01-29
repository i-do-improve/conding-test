//문제 설명
//정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
//num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.


//num_list 배열의 크기로 원소의 자리를 지정
//배열의 크기만큼 반복하여 i의 자리를 -1씩 이동
//배열의 크기가 5라면 5번째 i는 -1씩 5번 이동해서 가장 앞자리로 오게끔. 

class Solution {
    public int[] solution(int[] num_list) {
        //num_list의 원소순서를 이동시킬 answer배열 선언 
        int[] answer = new int[num_list.length];
        //num_list 원소 자리만큼 자리를 이동시켜주느 반복문
        for(int i=0; i<num_list.length; i++ ){
            answer[i]= num_list[num_list.length-i-1];
        }                                       //배열은 [0]부터니까 -1추가
        return answer;
    }
}