class Solution {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];

		answer[0] = getGCD(n,m);    //최대공약수
		answer[1] = getLCM(n,m);    //최소공배수

		return answer;
	}
	//최대 공약수 구하는 메서드 유클리드 호제법 이용.. 이해가 안되요 흑흑
	public int getGCD(int n,int m){
		if(n%m==0){
			return m;
		}
		return getGCD(m,n%m);
	}
	//최소공배수는 두 수를 곱한 값을 최대공약수로 나눠주면 된다고한다~
	public int getLCM(int n, int m){
		return n*m/getGCD(n,m);
	}
}