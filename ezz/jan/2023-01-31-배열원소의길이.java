//문제 설명
//문자열 배열 strlist가 매개변수로 주어집니다. 
//strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.

//st=29분 fi=48분
//문자열 배열의 원소가 증가할때마다 
//해당 원소의 길이를 answer배열의 원소로 지정 
class Solution {
    public int[] solution(String[] strlist) {
					//answer[]={strlist[] 원소의 길이};
        int[] answer = new int[strlist.length];
        //strlist[]의 원소 수 만큼 반복
        for(int i=0; i<strlist.length; i++){     
								//answer[]의 원소는 strlist[]원소의 길이     
                answer[i]= strlist[i].length();             
        }
        return answer;
    }
}