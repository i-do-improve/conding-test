//https://school.programmers.co.kr/learn/courses/30/lessons/86491
//1시간 걸려서 짰으나 .. 테스트케이스 실패..
//분류가 완전탐색.. 공부하고 다시 풀어야겠다..

class Solution {
	public int solution(int[][] sizes) {
		int answer = 0;
		int wMax=Integer.MIN_VALUE;
		int wMaxIndex=-1;
		int hMax=Integer.MIN_VALUE;
		int hMaxIndex=-1;

		for(int i=0;i<sizes.length;i++){
			if(sizes[i][0]>wMax){
				wMax=sizes[i][0];
				wMaxIndex=i;
			}
			if(sizes[i][1]>hMax){
				hMax=sizes[i][1];
				hMaxIndex=i;
			}
		}
		int result = wMax*hMax;
		int[][] newSizes1 = new int[sizes.length][2];
		int[][] newSizes2 = new int[sizes.length][2];
		// 깊은 복사 (for문 + clone 사용)
		for(int i = 0; i < sizes.length; i++) {
			newSizes1[i] = sizes[i].clone();
			newSizes2[i] = sizes[i].clone();
		}
		int tmp=newSizes1[wMaxIndex][0];
		newSizes1[wMaxIndex][0]=newSizes1[wMaxIndex][1];
		newSizes1[wMaxIndex][1]=tmp;

		int tmp2=newSizes2[hMaxIndex][0];
		newSizes2[hMaxIndex][0]=newSizes2[hMaxIndex][1];
		newSizes2[hMaxIndex][1]=tmp2;

		if(result>getResult(newSizes1)){
			if(getResult(newSizes1)>getResult(newSizes2)){
				return solution(newSizes2);
			}
			else{
				return solution(newSizes1);
			}
		}else if(result>getResult(newSizes2)){
			if(getResult(newSizes1)>getResult(newSizes2)){
				return solution(newSizes2);
			}
			else{
				return solution(newSizes1);
			}
		}
		return result;
	}

	public int getResult(int[][] sizes){
		int wMax=Integer.MIN_VALUE;
		int wMaxIndex=-1;
		int hMax=Integer.MIN_VALUE;
		int hMaxIndex=-1;

		for(int i=0;i<sizes.length;i++){
			if(sizes[i][0]>wMax){
				wMax=sizes[i][0];
				wMaxIndex=i;
			}
			if(sizes[i][1]>hMax){
				hMax=sizes[i][1];
				hMaxIndex=i;
			}
		}
		return wMax*hMax;
	}
}