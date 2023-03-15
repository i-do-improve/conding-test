//문제 :
//공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있다.
//정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 사람의 번호는 무엇인지 return
//풀이 : 
// 1. k가 1씩 감소할 때 마다 numbers[i+2] -> numbers[k-1에서 2씩 이동]
// 2. 인덱스가 배열의 끝에 다다르면 0으로 돌아가서 다시 이동 -> 2(k-1) % numbers[numbers.length] 
// 3. answer에 리턴

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        answer= numbers[2 * ( k - 1 ) % numbers.length ];
        return answer;
    }
}