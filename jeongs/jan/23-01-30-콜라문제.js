// give a
// receive b
// 빈 병의 개수 n
// a === n일 수 있다

// 3개주면 2개 받는 케이스 고려
function solution(a, b, n) {
    let result = 0;
    while (n >= a) {
        const give = n - (n % a);
        const receive = Math.floor(give / a) * b;
        
        result += receive;
        n = n - give  + receive;
    }
    
    return result;
}