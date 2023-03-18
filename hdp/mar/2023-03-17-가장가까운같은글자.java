//해당 인덱스의 왼쪽에 가장 가까운 같은 글자가 없으면 -1, 있으면 몇 칸 떨어져 있는지를 작성하는 문제
class Solution {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		//-1로 초기화
		for(int i=0;i<answer.length;i++){
			answer[i]=-1;
		}
		//스트링의 각 인덱스 순회
		for(int i=0;i<s.length();i++){
			int count=0;
			for(int j=i-1;j>=0;j--){    //각 인덱스의 바로 전부터 처음으로 가면서 같은게 있으면 count지정해주고 break;
				count++;
				if(s.charAt(j)==s.charAt(i)){
					answer[i]=count;
					break;
				}
			}
		}

		return answer;
	}
}