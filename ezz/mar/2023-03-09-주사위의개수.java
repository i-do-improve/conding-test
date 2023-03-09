//문제 : 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때, 상자에 들어갈 수 있는 주사위의 최대 개수를 return
//풀이 : 배열의 원소 / n 의 값을 모두 곱한 수를 return
class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        for(int i=0; i<box.length; i++){
            if(i==0){
                answer += box[i]/n;
            }else {
                answer *= box[i]/n;
                  }
        }
        return answer;
    }
}