public class 가위바위보 {



     // append 기능을 사용해주기 위해 stringbuilder를 이용
     // if 문에서 숫자로 비교해줘야 하기 때문에 rsp.charAt()로 index 객체를 따로 만들어주었다
     // 마지막에 그냥 return을 하면 레퍼런스값이 나오기 때문에 .tostring() 으로 처리를 해준다.

     class Solution {
          public String solution(String rsp) {
               StringBuilder answer = new StringBuilder();

               for (int i = 0; i < rsp.length(); i++) {
                    int index = rsp.charAt(i);

                    if (index == 2) {
                         answer.append("0");
                    } else if (index == 0) {
                         answer.append("5");
                    } else if (index == 5) {
                         answer.append("2");
                    }

               }

               return answer.toString();
          }
     }

}
