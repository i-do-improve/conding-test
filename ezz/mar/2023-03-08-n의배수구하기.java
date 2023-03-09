//문제 : numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return
//풀이 : numlist[i]가 n으로 나눴을 때 나머지가 0인 조건과 일치할 때 answer에 return
//answer[]의 초기값 할당을 위해 카운트하는 반복문 하나, answer[]에 값을 넣어주는 반복문 하나를 만들 것.
class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        int j = 0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[j] += numlist[i];
                j++;
            }
        }
        return answer;
    }
}