class Solution {
	public long solution(int price, int money, int count) {
		long answer = 0;
		long myMoney=money;
		for(int i=1;i<=count;i++){
			myMoney-=price*i;
		}
		if(myMoney<0){
			return -myMoney; //return Math.abs(myMoney);
		}

		return answer;
	}
}