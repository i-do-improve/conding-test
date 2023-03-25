//3진법으로 만들고, 앞뒤반전을 한 후 다시 10진법으로 표현한 숫자를 반환해야한다.
//StringBuilder가 String+=보다 실행속도가 확실히 빠르다.

class Solution {
	public int solution(int n) {

		int answer = 0;
		StringBuilder sb = new StringBuilder();
		// String str ="";

		while(n>0){//어차피 앞,뒤 반전을 해야하므로 str에 추가하면 앞,뒤 반전 한 상태
			sb.append(n%3);
			//str+=n%3;
			n/=3;
		}
		//long intVal = Long.parseLong(str);
		long intVal = Long.parseLong(sb.toString());//int는 범위초과로 인해 런타임에러...
		int mulVal = 1;
		while(intVal>0){
			answer+=mulVal*(intVal%10);
			intVal/=10;
			mulVal*=3;
		}
		return answer;
	}
}

/**
 * 다른 사람의 풀이.. 너무 간단하고 명료하다 으악
 * Integer.parseInt(String,진법)으로 3진법을 10진법으로 쉽게 변환할 수 있다
/*
class Solution {
	public int solution(int n) {
		String a = "";

		while(n > 0){
			a = (n % 3) + a;
			n /= 3;
		}
		a = new StringBuilder(a).reverse().toString();


		return Integer.parseInt(a,3);
	}
}*/
