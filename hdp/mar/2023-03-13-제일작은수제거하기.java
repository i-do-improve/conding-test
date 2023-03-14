 import java.util.*;
 class Solution {
     public int[] solution(int[] arr) {

         int minIndex=0;
         int minValue=arr[0];
         for(int i=1;i<arr.length;i++){
             if(minValue>arr[i]){
                 minIndex=i;
                 minValue=arr[i];
             }
         }
         int[] answer ;
         if(arr.length==1){      //원소가 하나일 때에는 빈 배열 대신 -1을 담아서 반환
             answer = new int[1];
             answer[0]=-1;
         }else{                  //그 외에는 최소값을 뺀 나머지를 넣어서 반환
             answer = new int[arr.length-1];
             int index=0;
             for(int i=0;i<arr.length;i++){
                 if(i!=minIndex){
                     answer[index]=arr[i];
                     index++;
                 }
             }
         }
         return answer;
     }
 }
/* 다른 사람의 풀이..
스트림을 이용해서 풀었는데 실행속도가 많이 느린 것 같다.
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

class Solution {
	public int[] solution(int[] arr) {
		if (arr.length <= 1) return new int[]{ -1 };
		int min = Arrays.stream(arr).min().getAsInt();
		return Arrays.stream(arr).filter(i -> i != min).toArray();
	}
}*/
