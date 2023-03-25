//같은 숫자가 연속해서 나오면 하나만 저장하는 문제, 동떨어져 있으면 같은 숫자라도 저장가능
//이전 숫자를 기억하고 비교해가면서 풀면 될 것 같았다.

import java.util.*;
public class Solution {
	public int[] solution(int []arr) {

		List<Integer> list = new ArrayList<>();
		int beforeNum=arr[0];
		list.add(beforeNum);
		for(int i=1;i<arr.length;i++){
			if(beforeNum==arr[i]){
				continue;
			}else{
				list.add(arr[i]);
				beforeNum=arr[i];
			}
		}
		return list.stream().mapToInt(i->i).toArray();
/*  다른 사람의 풀이 보니까 스트림을 안 쓰면 실행시간이 더 빨랐다.
		int[] answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i).intValue(); //.intValue() 안해도 알아서 int로 언박싱 된다고 한다.
		}
		return answer;
*/
	}
}