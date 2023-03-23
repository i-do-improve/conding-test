package mar;

import java.util.Arrays;

class 가까운수 {
    public int solution(int[] array, int n) {
        
        // Arrays.sort(array); 정렬 안해줘도 됨
        int min = array[0] - n;
        int answer = array[0];

        // 최솟값(min)의 디폴트값을 미리 설정해두고, 다른 수들과 차례로 비교하면서 더 가까운 수가 나올 시 min값을 교체

    
        for(int i = 0; i < array.length; i++){
            if(Math.abs(min - n) > Math.abs(array[i] - n)){
                min = array[i];
            }else if(Math.abs(min - n) == Math.abs(array[i] - n) &&
                     min > array[i]){
                min = array[i];
            }
        }
        return answer = min;
    }
}