//필요예산을 오름차순 정렬하여, 전체예산에서 가능한 범위만큼 작은 예산 순서대로 숫자를 세서 풀었다.
import java.util.*;
class Solution {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);// 배열 오름차순 정렬
		for(int i=0;i<d.length;i++){
			if(budget>=d[i]){
				answer++;
				budget-=d[i];
			}
		}
		return answer;
	}
}