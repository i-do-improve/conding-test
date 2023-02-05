// 12:38 ~ 12:43
function solution(n) {
    let x = 1;
    while (n % x !== 1) {
        x++;
    }
    
    return x;
}