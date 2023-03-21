//행렬의 덧셈, 같은 인덱스끼리 더한 값을 반환
class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		for(int i=0;i<answer.length;i++){
			for(int j=0;j<answer[0].length;j++){
				answer[i][j]=arr1[i][j]+arr2[i][j];
			}
		}

		return answer;
	}
}
//int[][] answer = arr1; 이렇게 하고 answer에 arr2의 값을 더하고 반환하면
//새 배열을 만들 필요가 없어지긴 한다고 한다!