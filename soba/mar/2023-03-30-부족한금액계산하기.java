package mar;

//return : (price + price * 2 + price *3 ... + price * n) - money
// but return이 음수면 0 출력
// long말고 int로 선언하면 에러남

class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        
        for(int i = 1; i <= count; i++){
            total += price * i;
        }
        answer = total - money;

        return answer = (answer < 0) ? 0 : answer;
    }
}