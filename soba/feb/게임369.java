/* order에 3,6,9 가 나올 때 마다 리턴 값을 +1 시켜줘라
1.숫자형을 어떻게 string 형으로 바꾸지? (주어진 숫자의 인덱스를 구하기 위해)
2.숫자의 길이는 어떻게 구하는가?
--->
1. int형을 String형으로 바꾸는 방법 String.valueOf()
2. int형의 자릿수를 구하는 방법 (int)Math.log10() + 1 를 해주면 자릿수를 구할 수 있음.

*/


class 게임369 {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        
        for(int i = 0; i < (int)Math.log10(order) + 1; i++){
            if(str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == 
               '9'){
                answer++;
            }
        }return answer;
    }