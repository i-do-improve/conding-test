//외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
//정수 배열 emergency가 매개변수로 주어질 때 
//응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.


//emergency배열을 내림차순하여 sample[]에 넣어주기 
//answer = emergency배열의 원소와 sample[]의 원소중 일치하는 sample[]의 원소 인덱스 값 + 1
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] sample =new Integer[emergency.length];
        for(int i=0; i<emergency.length; i++){
            sample[i] = Integer.valueOf(emergency[i]);
        }
        
        Arrays.sort(sample, Collections.reverseOrder());
                            //내림차순
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<sample.length; j++){
                if(emergency[i] == sample[j]){
                    answer[i] = j+1;
                
                }
            }
        }
        
        return answer;
    }
}
