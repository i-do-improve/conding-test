class Solution {
    public int solution(int n, int k){  
        //먼저 결제금액에서 
        int answer = 12000*n + 2000*k;
        //서비스 음료수만큼 차감
        if(n >= 10)     
           answer -= (n/10) * 2000;    
        return answer;
    }
}