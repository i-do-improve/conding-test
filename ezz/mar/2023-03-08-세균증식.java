//문제 :  1시간에 두배만큼 증식하는 n마리의 세균이 t시간 후의 세균의 수를 return
//풀이 : n에 2를 t만큼 곱하여 return
class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        
        if(t == 0)return n;
        return solution(2*n,t-1);
               
    }
}