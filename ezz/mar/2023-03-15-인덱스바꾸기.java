//문제 : my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 
//풀이 : my_string을 split()으로 하나씩 떼어서 배열로 저장하고 num1,num2가 인덱스인 문자인 경우인 조건을 걸어 바꿔서 리턴해준다.
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String [] arrMy = my_string.split("");
        for(int i=0; i<arrMy.length; i++){
            if(i == num1){
                answer += arrMy[num2];
            }
            else if(i == num2){
                answer += arrMy[num1];
            }else {
                answer += arrMy[i];
            }
        }
        
        return answer;
    }
}