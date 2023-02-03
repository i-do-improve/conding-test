//문제 설명
//선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.

//가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 
//세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.

//sides[]의 길이는 3
//원소를 크기대로 나열
//3개의 원소중 가장 큰 값이 다른 두 원소의 합보다 작으면 1 같거나 크면 2 리턴
import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
			 //Arrays.sort()로 오름차순으로 정렬
        Array.sort(sides);
       //조건문 들어 갈 영역      
        return answer;
    }
}