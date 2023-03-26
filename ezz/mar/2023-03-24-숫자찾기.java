//문제 : num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return
//풀이 : 매개변수를 String으로 바꿔 contains와 indexOf를 활용하여 해당 값을 return
class Solution {
    public int solution(int num, int k) {        
        int answer = 0;
        String stringNum = num+"", stringK = k+"";
        
        if(stringNum.contains(stringK)){
            answer = stringNum.indexOf(stringK)+1;           
        }else {
            answer= -1;
        }                
        return answer;
    }        
}
