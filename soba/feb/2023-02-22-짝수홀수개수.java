class 짝수홀수개수 {
    public int[] solution1(int[] num_list) {
        int[] answer = new int[2];
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }
        
        return answer;
    }

    // 다른 풀이
    class Solution2 {
        public int[] solution2(int[] num_list) {
            int[] answer = new int[2];

            for(int i = 0; i < num_list.length; i++)
                // 이러면 자연스럽게 첫번째 요소에 짝수, 두번째 요소에 홀수가 들어간다...
                answer[num_list[i] % 2]++;

            return answer;
        }
    }
}