//문제 : num_list를 다음 설명과 같이 2차원 배열로 바꿔 return
//풀이 : amswer의 원소값을 할당해주고 answer원소에 num_list원소를 하나씩 대입하여 return
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int count=0;
       
            for(int i=0; i<answer.length; i++){
                for(int j=0; j<answer[i].length; j++){                 
                    answer[i][j]=num_list[count]; 
                    count++;
                }           
            }        
        return answer;
    }
}