package mar;

class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {

        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String[] tmp = sb.reverse().toString().split("");

        int[] answer = new int[sb.reverse().toString().length()];

        for(int i = 0; i < sb.reverse().toString().length(); i++){
            answer[i] = Integer.parseInt(tmp[i]);
        }

        return answer;
    }
}