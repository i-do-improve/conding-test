import java.util.*;
class Solution {
	public int solution(String s) {
		List<String> list = new ArrayList<>();
		char orgChar='0';
		int orgCount=0;
		int otherCount=0;
		String tmp="";
		for(int i=0;i<s.length();i++){
			//첫 문자일 때
			if(orgChar=='0'){
				orgChar=s.charAt(i);
				orgCount++;
				tmp+=s.charAt(i);
			}else{  //첫 문자가 아닐 때
				if(orgChar==s.charAt(i)){   //첫 문자 개수 증가
					orgCount++;
				}else{          //다른 문자 개수 증가
					otherCount++;
				}
			}
			//첫문자의 개수와 다른 문자의 개수가 같으면 문자를 list에 넣어주고 변수들초기화
			if(orgCount==otherCount){
				tmp+=s.charAt(i);
				list.add(tmp);
				orgChar='0';
				tmp="";
				orgCount=0;
				otherCount=0;
			}
			//입력문자의 마지막일 때 남아있는 문자 있으면 처리후 끝
			if(i==s.length()-1){

				if(tmp!=""){
					list.add(tmp);
				}

			}

		}

		return list.size();
	}
}