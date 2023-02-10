public class 가위바위보 {



     /* 2023-02-10 수정
     문자열의 인덱스에 해당하는 문자를 뽑아내기 위해 charAt() 매서드를 사용
     그런데 charAt()은 char 형이다 따라서 chr이라는 객체를 만들어줄때 데이터타입을 char로 해줘야 함
     char는 비교할 때 "" 가 아니라 '' 에 넣어줘야 함 string이랑 같다고 생각하여 '' 에 넣으면 문제 발생

     번외로 String 타입을 비교할 때는 .equals() 매서드를 이용해 줘야함
     자바는 뭔 데이터 타입마다 방식이 다 다름 ...
      */


     // append 기능을 사용해주기 위해 stringbuilder를 이용
     // if 문에서 숫자로 비교해줘야 하기 때문에 rsp.charAt()로 index 객체를 따로 만들어주었다
     // 마지막에 그냥 return을 하면 레퍼런스값이 나오기 때문에 .tostring() 으로 처리를 해준다.

     class Solution {
          public String solution(String rsp) {
               StringBuilder answer = new StringBuilder();

               for (int i = 0; i < rsp.length(); i++) {
                    // 여기서 stirng 타입을 이용하여 equals()를 쓰려고 했지만 charAt()는 char으로 반환돼서 못씀
                    // 추가로 char형태를 int형으로 변환하게 되면 아스키 코드가 출력됨 즉 0이 48로 출력
                    char chr = rsp.charAt(i);


                    if (chr == '2') {
                         answer.append("0");
                    } else if (chr == '0') {
                         answer.append("5");
                    } else if (chr == '5') {
                         answer.append("2");
                    }

               }

               return answer.toString();
          }
     }

}
