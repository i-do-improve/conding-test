// 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사
// 삼총사를 만들 수 있는 방법의 수

function solution(number) {
    let first = 0, second = 1, third = 2;
    const length = number.length - 1;
    let result = 0;
    
    while(first <= length - 2 && second <= length - 1 && third <= length) {
        if (number[first] + number[second] + number[third] === 0) {
            result++;
        }
        if (second === length - 1) {
            first++, second = first + 1, third = second + 1;
            continue;
        }
        if (third === length) {
            second++;
            third = second + 1;
            continue;
        }
        third++;
    }
    return result;
}