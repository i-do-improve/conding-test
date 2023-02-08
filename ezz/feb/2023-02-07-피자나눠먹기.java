//머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 
//피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, 
//n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 
//최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.



//피자조각 = 6
//n명이 같은 조각의 피자를 먹어야할 때
//gcd 알고리즘 응용해보기 
class Solution {
    public int solution(int n) {
        int answer =1;
        
        while(answer*6%n != 0){
            answer++;
        }        
        return answer;
    }
}
