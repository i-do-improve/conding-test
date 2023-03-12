// 12:05 ~ 12:11
// 하샤드 수: x % x의 각 자리수의 합 === 0
// 1 <= x <= 10000
function solution(x) {
    return x % String(x).split('').reduce((acc, num) => acc + Number(num), 0) === 0;
}