//문제 설명
//첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 
//두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
//두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.


//answer에 담아 리턴할 분자 변수, 분모 변수만들기
//최대공약수를 구하는 반복문으로 기약분수 구하기
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int bunja = (numer1 * denom2) + (numer2 * denom1); 
        int bunmo = denom1 * denom2;
        //분자보다 작은수로 분모, 분자를 나눴을때 둘 다 나머지가 0이 나오는 기약분수를 구하는 반복문 
        for(int i = bunja-1; i > 1; i--) {
            
            if(bunja % i == 0 && bunmo % i == 0) { 
                bunja /= i;
                bunmo /= i;
            }
        }        
        int[] answer = {bunja, bunmo};
        return answer;
    }
}