// 10:49 ~ 10:58
// numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 
function solution(numbers) {
    // let findStr = '';로 초기화
    // for of문 돌면서 findStr에 더하고, NUMBERS[findStr] 했을 때 값을 찾으면 result에 더함.
    // return result;
    let findStr = '', result = '';
    for (const str of numbers) {
        findStr += str;
        if (NUMBERS[findStr] !== undefined) {
            result += NUMBERS[findStr];
            findStr = '';
        }
    }
    return Number(result);
}

const NUMBERS = {
    zero: 0,
    one: 1,
    two: 2,
    three: 3,
    four: 4,
    five: 5,
    six: 6,
    seven: 7,
    eight: 8,
    nine: 9,
}