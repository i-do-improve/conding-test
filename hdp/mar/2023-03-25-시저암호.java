class Solution {
	public String solution(String s, int n) {

		char[] charArr = s.toCharArray();

		for(int i=0;i<charArr.length;i++){
			if(charArr[i]==' '){    //공백: 넘어감
				continue;
			}else if('a'<=charArr[i]&&'z'>=charArr[i]){    //소문자
				int num = charArr[i]+n;
				while(num>'z'){     //소문자 범위를 넘어가면 26을 빼줌
					num-=26;
				}
				char ch=(char)num;
				charArr[i]=ch;
			}else{      //대문자
				int num = charArr[i]+n;
				while(num>'Z'){
					num-=26;
				}
				char ch=(char)num;
				charArr[i]=ch;
			}
		}
		String answer = new String(charArr);
		return answer;
	}
}

/**
 * 다른 사람의 풀이
 * 너무 간단해 보인다.. 수식짜는 능력을 키워야겠다.. 흑흑흑
 */
/*

class Solution {
	public String solution(String s, int n) {
		String answer = "";
		for(char ch : s.toCharArray()) {
			if(ch==' ') {
				answer += ch;
			}else if(ch>='a'&& ch<='z'){
				answer += (char)('a' + (ch+n-'a')%26);
			}else {
				answer += (char)('A' + (ch+n-'A')%26);
			}
		}
		System.out.println(answer);
		return answer;
	}
}
*/
