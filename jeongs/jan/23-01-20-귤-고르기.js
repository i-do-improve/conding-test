// 바꾼 풀이
function solution(k, tangerine) {
    if (k === 1) return 1;
    
    const object = {};
    let answer = 0;
    
    tangerine.forEach((value, index) => {
        if (!object[value]) {
            object[value] = 1;
            return;
        }
    if (object[value] > 0) {
        object[value]++;
    }
    })
    
    const sortArray = Object.entries(object).sort((a,b) => {
        const [aKey, aValue] = a;
        const [bKey, bValue] = b;
        return bValue - aValue;
    });
    
    for (const [key, value] of sortArray) {
        answer++; // 1로 더하고 시작
        
        if (k > value) k -= value;
        else break; // k와 같거나 k보다 클 경우 break;
    }
    return answer;
}

// 내가 푼 풀이
function solution(k, tangerine) {
    if (k === 1) return 1;
    
    const object = {};
    let result = [];
    
    tangerine.forEach((value, index) => {
        if (!object[value]) {
            object[value] = 1;
            return;
        }
        if (object[value] > 0) {
            object[value]++;
        }
    })
    
    const sortArray = Object.entries(object).sort((a,b) => {
        const [aKey, aValue] = a;
        const [bKey, bValue] = b;
        return bValue - aValue;
    });
    
    
    // 만약 처음부터 value가 k보다 크다면 그냥 1이 답
    const [_, value] = sortArray[0];
    if (value >= k) return 1;
    
    // value가 k보다 클 때까지 result에 push
    const sumToK = sortArray.reduce((acc, cur) => {
        const [key, value] = cur;
        
        if (value + acc > k) {
            return acc;
        }
        result.push(cur);
        return value + acc;
    }, 0);
    
    // sum값이 k와 딱 맞지 않을 경우
    // 1. 끝까지 다 돌았는데 여전히 k보다 sum이 작음
    // 2. 끝까지 다 돌았는데 k와 딱 맞는 값이 없음
    
    if (sumToK < k && result.length < sortArray.length) {
        // console.log(sumToK, k, 'sum')
        // console.log(sortArray, 'not enough')
        // console.log(result, 'result not enough')
        return result.length + 1
    }
    
    return result.length;
}