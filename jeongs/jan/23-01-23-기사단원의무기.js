// number까지의 자연수 배열 만들기
// 약수의 개수를 구한 뒤, 제한 수치를 넘으면 제한 수치를 더하고, 아닐 경우 약수의 개수 더하기.
function solution(number, limit, power) {
    const numbers = Array.from(new Array(number)).map((_, index) => index + 1);
    
    return numbers.reduce((acc, cur) => {
        const countDivision = getDivision(cur).length;
        
        return (countDivision > limit) ? acc + power : acc + countDivision
    }, 0);
    
}

const getDivision = (num) => {
    const divisors = [];
    
    for (let i = 1; i <= num / 2; i++) {
        // i로 나눴을 때 나머지가 이면 약수
        if (num % i === 0) divisors.push(i); 
    }
    
    // num 본인은 push되지 않았기 때문에 마지막에 추가
    return [...divisors, num];
}