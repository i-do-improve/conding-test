class Solution {
    public long solution(long n) {
        double k = Math.sqrt(n);
        return k%1==0 ? (long)Math.pow(k+1,2) : -1;
    }
}
