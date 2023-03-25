package mar;

import java.util.Arrays;


/*
1. 문자열을 공백없이 담아서 int배열로 만들어줘야 함 + 여기서 -1이 -, 1 로 구분되면 안됨 (공백으로 구분되어 있다는 것이 힌트였음 -> 규칙적인 패턴을 이용해 분류하는 방법 : split)
2.(int + " ")하면 알아서 문자열로 변환
*/

class 최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int[] intArr = new int[strArr.length];
        
        for(int i = 0; i < strArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        
        Arrays.sort(intArr);
        // 이제 비로소 순서대로 정렬된 int형 배열이 나왓음
        
        return answer+intArr[0]+" "+intArr[intArr.length-1];
        
    }
}