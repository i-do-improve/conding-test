class Solution {
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		if(s.length()%2==0){//짝수일 때
			answer.append(s.charAt(s.length()/2-1));
			answer.append(s.charAt(s.length()/2));
		}else{  //홀수일 때
			answer.append(s.charAt(s.length()/2));
		}

		return answer.toString();
	}
}
/*
class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0){//짝수일 때
            answer+=s.charAt(s.length()/2-1);
            answer+=s.charAt(s.length()/2);
        }else{  //홀수일 때
            answer+=s.charAt(s.length()/2);
        }

        return answer;
    }
}
*/

