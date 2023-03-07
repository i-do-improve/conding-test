package mar;

import java.util.Arrays;

class 정수내림차순으로배치하기 {
    public long solution(long n) {

            String str = String.valueOf(n);
            String[] arr = str.split("");
            Arrays.sort(arr);

            StringBuilder answer = new StringBuilder();

            for(String a : arr){
                answer.append(a);
            }

            return Long.parseLong(answer.reverse().toString());

    }
}