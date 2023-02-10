class Solution {
    public int solution(int n, int k) {

        int answer = (n * 12000) + (k * 2000) - ((int)n/10 * 2000);



        return answer;

    }
}

class Solution2 {
    public int solution(int n, int k) {

        return (n * 12000) + (k * 2000) - ((int)n/10 * 2000);
    }
}


