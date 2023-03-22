//문제 : n의 약수를 오름차순으로 담은 배열을 return
//풀이 :Stream을 이용하여 filter를 통해 약수의 조건에 해당하면 배열에 추가하여 return 
import java.util.stream.IntStream;
class Solution {   
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> (n % i == 0)).toArray();
    }
}
