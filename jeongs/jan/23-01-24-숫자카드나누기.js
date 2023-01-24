// 두 조건중 하나를 만족하는 가장 큰 양의 정수
// 만약, 조건을 만족하는 a가 없다면, 0을 return

// arrayA의 최소공배수가 있으면, arrayB를 돌며 나머지가 0이 아닌지 체크 => 맞다면 return
// 없다면, 
    // arrayB의 최소공배수를 찾고 없다면 return 0
    // 있다면 arrayA를 돌며 나머지가 0이 아닌지 체크 -> 맞다면 return

// 11 ~ 18번까지 런타임 에러가 남. 나머지는 다 통과.

    function solution(arrayA, arrayB) {
        // arrayA의 가장 작은 값
        const divisions = getDivision(Math.min(...arrayA)).sort((a, b) => b - a);
        const result = [];
        // divisions 순회하며 arrayA의 약수이고, arrayB의 약수가 아닌지 찾음.
        for (const division of divisions) {
            const aTruty = arrayA.every((a) => (a === division) ? true : a % division === 0);
            const bFalsy = arrayB.every((b) => (b === division) ? false : b % division > 0);
            
            if (aTruty && bFalsy) {
                result.push(division);
                break;
            }
        }
        
        const bDivisions = getDivision(Math.min(...arrayB)).sort((a, b) => b - a);
        for (const division of bDivisions) {
            const bTruty = arrayB.every((b) => (b === division) ? true : b % division === 0);
            const aFalsy = arrayA.every((a) => (a === division) ? false : a % division > 0);
            
            if (bTruty && aFalsy) {
                result.push(division);
                break;
            }
        }
        
        if (result.length === 0) return 0;
        return (result.length === 2) ? Math.max(...result) : result[0];
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
    function solution(arrayA, arrayB) {
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