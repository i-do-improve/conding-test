//가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, 
//rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.

//rsp 길이만큼 반복문 안에 rsp를 문자로 변환하고
//스위치 케이스로 이기는 답을 도출한 다음 
//asnwer에 리턴 

class Solution {
    public String solution(String rsp) {
        StringBuilder  answer = new StringBuilder();
        
        for(int i=0; i<rsp.length(); i++){
            char ch = rsp.charAt(i);
            
            switch(ch) {
                case '0':
                    answer.append("5"); break;
                case '2':
                    answer.append("0"); break;
                default:
                    answer.append("2");  
            }        
        }        
        return answer.toString();
    }
}