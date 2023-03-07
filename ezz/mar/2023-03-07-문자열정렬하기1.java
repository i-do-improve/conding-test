// 문제 : my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return
// 풀이 : my_string의 숫자문자열을 제외 모두 제거 후 정렬하고 정수로 변환하여 answer에 return

import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {        
        String[] arrSt = my_string.replaceAll("[^0-9]", "").split("");
        
        Arrays.sort(arrSt);
        
        int[] answer = new int[arrSt.length];
        
        for (int i = 0; i < answer.length; i++) {
				answer[i] = Integer.parseInt(arrSt[i]);
		}                      
        return answer;
    }
}