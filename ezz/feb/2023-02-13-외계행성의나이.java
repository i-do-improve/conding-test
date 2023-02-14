//우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 
//입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. 
//a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 
//나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.

//a부터 j까지 char 배열aaa 생성
//age를  String bbb로 변환
//answer에 aaa배열 원소의 인덱스번호와 bbb가 일치하는 해당 aaa배열의 원소로 변환하여 추가

class Solution {
    public String solution(int age) {
        String answer = "";
        char [] aaa ={'a','b','c','d','e','f','g','h','i','j'};
        String bbb=String.valueOf(age); //String 23
                   //String bbb의 자체적으로 있는 인덱스를 
        for(int i=0; i<bbb.length(); i++){
            char s =bbb.charAt(i); //bbb를 char로 변환
            int index= s-48;  //다시 숫자로 변환
            answer+=aaa[index]+""; //변환 한 숫자의 인덱스에 위치한 aaa 원소를 넣고 String으로 변환하여 리턴
        }                   
        return answer;
    }
}