//정수 n이 제곱수면 1 아니면 2 return
//제곱근을 구해주는 함수 Math.sqrt() 이용하여 제곱근이 자연수일 경우 제곱수임으로 1리턴 아니면 2
class Solution {
    public int solution(int n) {
        int answer = 0;
                
        if( Math.sqrt(n) % 1 == 0){return 1;
        }return 2;
    }
}