class n의배수고르기기 {
    public int[] solution(int n, int[] numlist) {
        int length = 0;
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                length++;
            }
        }
        
        int[] answer = new int[length];
        
        int j = 0;
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[j] = numlist[i];
                j++;
            }
        }
        return answer;
    }
}