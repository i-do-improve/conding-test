package mar;

class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;

        String str = String.valueOf(x);

        for(int i = 0; i < str.length(); i++){
            num += str.charAt(i) - 48;
        }
        answer = x % num == 0;

        return answer ;
    }
}

        /* 다른 풀이
        class Solution {
            public boolean solution(int x) {
                boolean answer = true;
                String str = String.valueOf(x);
                String[] arr = str.split("");
                int val = 0;

                for(String s : arr){
                    val += Integer.parseInt(s);
                }

                return answer = x % val == 0;
            }
        }
        */