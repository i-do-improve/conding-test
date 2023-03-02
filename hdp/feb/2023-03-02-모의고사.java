import java.util.*;
//import java.util.stream.*;
class Solution {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int[][] supos = {{1,2,3,4,5},       //각 수포자들의 패턴
				{2,1,2,3,2,4,2,5},
				{3,3,1,1,2,2,4,4,5,5}};
		int[] count = new int[3]; // 정답 수 저장할 배열
		for(int i=0;i<answers.length;i++){  //들어온 문제를 도는데
			for(int j=0;j<supos.length;j++){    //각 수포자들의 답과 같으면 정답수 늘림
				if(answers[i]==supos[j][i%supos[j].length]){
					count[j]++;
				}
			}
		}
		List<Integer> list = new ArrayList<>();

		int max=0;  //정답수의 최대값 구함
		for(int i=0;i<count.length;i++){
			if(max<count[i]){
				max=count[i];
			}
		}
		for(int i=0;i<count.length;i++){
			if(max==count[i]){  //정답수가 최대값인 수포자번호(1,2,3) 저장
				list.add(i+1);
			}
		}
		answer = list.stream()  //List<Integer>->Stream<Integer>
				.mapToInt(i -> i) // -> IntStream?
				.toArray();       // int[] 배열로변경
		return answer;
	}
}