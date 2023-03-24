//문제 : n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return
//풀이 : list를 선언하여 소인수를 넣어주고 배열로 전환하여 리턴한다.
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        List<Integer> array = new ArrayList<>();
        for (int i = 2; i<=n; i++) {
            if (n % i == 0) {
                while(n%i==0){n /= i;} 
                array.add(i);
            }
        }        
        int[] answer = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}