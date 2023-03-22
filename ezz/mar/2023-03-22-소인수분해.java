
//문제 : n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return
//풀이 : IntStream을 활용하여 소인수를 구하고 중복제거와 정렬후 반환한다.
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int n) {
        
        
        return IntStream.rangeClosed(2, n).filter(i -> (n%i == 0)).distinct().sorted().toArray();
    }
}