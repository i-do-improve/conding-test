//문제 설명
//머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 
//모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

class Solution {
    public int solution(int n) {
        int answer = 0;
        double x = n%7; 
        if(n<7){ //인원이 피자조각의 수보다 작을때 (ex= 1~6)
            answer=1;
        }else if(x == 0){//피자가 딱 떨어질 때 (ex= 7,14,21)
            answer = n/7;
        }else if(x != 0){//피자가 부족해서 한 판 더 시킬 때 (ex=8,15,22)
            answer = n/7+1;
        }
        return answer;
    }
}