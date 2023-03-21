
//문제: 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 
//풀이: 반복문을 이용하여 최대값, 최대값의 인덱스 구하여 return
class Solution {
    public int[] solution(int[] array) {
        int[] answer=new int[2];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }            
        return answer;   
    }
}