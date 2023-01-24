// 두 조건중 하나를 만족하는 가장 큰 양의 정수
// 만약, 조건을 만족하는 a가 없다면, 0을 return

// arrayA의 최대공약수가 있으면, arrayB를 돌며 나머지가 0이 아닌지 체크 => 맞다면 return
// 없다면, 
    // arrayB의 최대공약수를 찾고 없다면 return 0
    // 있다면 arrayA를 돌며 나머지가 0이 아닌지 체크 -> 맞다면 return

// 11 ~ 18번까지 런타임 에러가 남. 나머지는 다 통과. -> 시간 초과때문이었음 ;

function solution2(arrayA, arrayB) {
    const aResult = getResult(arrayA, arrayB);
    const bResult = getResult(arrayB, arrayA);

    if (aResult && bResult) return Math.max(aResult, bResult);
    if (!aResult && !bResult) return 0;
    return aResult ? aResult : bResult;
}
    
const getResult = (truthyArray, falsyArray) => {
    const divisions = getDivision(truthyArray[0]).sort((a, b) => b - a);
    for (const division of divisions) {
        const truthy = truthyArray.every((value) => (value === division) ? true : value % division === 0);
        const falsy = falsyArray.every((value) => (value === division) ? false : value % division > 0);
        
        if (truthy && falsy) {
            return division;
        }
    }
}
    
const getDivision = (num) => {
    const divisors = [];

    for (let i = 1; i <= num / 2; i++) {
        if (num % i === 0) divisors.push(i); 
    }

    return [...divisors, num];
}

// 1. 두 배열의 가장 큰 값을 구한뒤, 그 값의 절반부터 2까지 a로 친다.
// 2. arrayA, arrayB 둘다 돌아가며 각각 나머지가 있고, 한쪽엔 없는 답을 찾는다.
// 3. 답이 없을 경우 반대 경우도 찾는다.
// 4. 조건을 만족하지 않을 경우 a를 return
// 시간초과뜸
function solution1(arrayA, arrayB) {
    const max = Math.floor(Math.max(...arrayA, ...arrayB) / 2);
    
    for (let i = max; i >= 2; i--) {
        const truty = arrayA.every((value) => value % i === 0);
        if (truty) {
            const falsy = arrayB.every((value) => value % i > 0);
            if (truty && falsy) {
                return i;
            }
        } else {
            const falsy = arrayA.every((value) => value % i > 0);
            const truty = arrayB.every((value) => value % i === 0);
            if (truty && falsy) {
                return i;
            }
        }
        
    }
    return 0;
}