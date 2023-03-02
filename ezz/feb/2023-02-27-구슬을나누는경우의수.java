//머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 
//머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, 
//balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

//갖고 있는 구슬의 개수 balls
//친구들에게 나누어 줄 구슬 개수 share
//balls개를 share개로 나눌 수 있는 모든 경우의 수
////-> answer = balls! / (balls - share)! * share!구하기 
import java.math.BigInteger;
class Solution {
    
   // BigInteger로 팩토리얼을 구하는 함수
   public BigInteger fac(int number) {
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }        
        return result;
    }
    //분수를 BigInteger 풀이
    public BigInteger solution(int balls, int share){
        int sample = balls - share;
        return fac(balls).divide(fac(sample).multiply(fac(share)));
    }
    
}