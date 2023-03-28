//각 문자열의 인덱스 n 기준으로 정렬, n번째 인덱스가 같은 경우 사전순으로 비교해서 정렬
//
class Solution {
	public String[] solution(String[] strings, int n) {
		String[] answer = {};

		//먼저, 해당 문자열 기준으로 정렬을 해보자
		for(int i=0;i<strings.length;i++){
			for(int j=i+1;j<strings.length;j++){
				if(strings[i].charAt(n)>strings[j].charAt(n)){
					String tmp = strings[i];
					strings[i]=strings[j];
					strings[j]=tmp;
				}
			}
		}

		//이제 인덱스의 문자가 같은 것들은 사전순으로 정렬을 해보자
		for(int i=0;i<strings.length;i++){
			for(int j=i+1;j<strings.length;j++){
				if(strings[i].charAt(n)==strings[j].charAt(n)){
					if(strings[i].compareTo(strings[j])>0){
						String tmp = strings[i];
						strings[i]=strings[j];
						strings[j]=tmp;
					}

				}
			}
		}

		return strings;
	}
}
