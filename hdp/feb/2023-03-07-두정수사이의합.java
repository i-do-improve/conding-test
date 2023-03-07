class Solution {
	public long solution(int a, int b) {
		return a==b ? a : a>b?getBetweenSum(a,b):getBetweenSum(b,a);
	}
	public long getBetweenSum(int a, int b){
		long ans=0;
		for(int i=b;i<=a;i++){
			ans+=i;
		}
		return ans;
	}
}