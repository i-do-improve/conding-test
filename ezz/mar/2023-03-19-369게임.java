//문제 : rder가 매개변수로 주어질 때, 3, 6, 9의 개수만큼 쳐야할 박수 횟수를 return
//풀이 : 각 자리의 수를 3 or 6 or 9로 나눴을 때 0이 되면 asnwer++하여 return
class Solution {
    public int solution(int order) {
        int answer = 0;
         while (order > 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9){
                answer++;
            }
            order /= 10;
        }
        return answer;
    }
}