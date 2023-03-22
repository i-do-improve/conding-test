class 진료순서정하기 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int rank = 1;
        
    
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    rank++;
                }
            }
            answer[i] = rank;
            rank = 1;
        }
        return answer;
    }
