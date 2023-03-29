//문제 : after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return
//풀이 : before와 after를 Char배열로 변환하여 원소들을 정렬한 뒤 두 값이 같다면 1 아니면 0 리턴
import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;        
        char [] arrayAfter = before.toCharArray();
        char [] arrayBefore = after.toCharArray();
            
        Arrays.sort(arrayAfter);
        Arrays.sort(arrayBefore);
            
        String strBe = new String(arrayBefore);
        String strAf = new String(arrayAfter);
            
        if(strBe.equals(strAf)){
            return 1;
        }return 0;

    }
}