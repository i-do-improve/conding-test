//정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

//array배열의 원소들을 전부 n과 비교하는 반복문
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(n == array[i]){
                answer++;
            }
        }
        return answer;
    }
}