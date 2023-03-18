package mar;

class 제일작은수제거하기 {
    public int[] solution(int[] arr) {

        if(arr.length == 1){
          int[] answer = {-1};
          return answer;
      }

      int[] answer = new int[arr.length-1];
      int minIndex=0;

      for(int i=0;i<arr.length;i++){
          if(arr[minIndex]>arr[i]){
              minIndex = i;
          }
      }
      for(int i=minIndex+1;i<arr.length;i++){
          arr[i-1] = arr[i];
      }
      for(int i=0;i<answer.length;i++){
          answer[i] = arr[i];
      }
      return answer;
    }
}