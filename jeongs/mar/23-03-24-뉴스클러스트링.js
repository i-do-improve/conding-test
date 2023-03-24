// 10:02 ~ 10:40
function solution(str1, str2) {
    let intersection = 0;
    let dup = 0;
    const zarcard = 65536;
    
    // 1. 두문자씩 끊기
    const cuttedStr1 = setAsTwo(str1);
    const cuttedStr2 = setAsTwo(str2);
    
    // 2. map으로 중복된 값 계산
    const countStr1 = calcSame(cuttedStr1);
    const countStr2 = calcSame(cuttedStr2);
    
    // 3. entries로 돌면서 key값이 존재할 경우, 교집합 1씩 더함. 합집합은 다 더하되 둘다 동일할 경우 높은 쪽을 더함
    for (const [key, count] of countStr1.entries()) {
        if (countStr2.has(key)) {
            const count2 = countStr2.get(key);
            
            intersection += Math.min(count, count2); 
            dup += Math.max(count, count2);
        } else {
            dup += count;
        }
    }
    
    for (const [key, count] of countStr2.entries()) {
        if (!countStr1.has(key)) {
            dup += count;
        } 
    }
    
    if (intersection === dup) return zarcard;
    else return parseInt((intersection / dup) * zarcard)
    
    
}

function calcSame (array) {
    const sets = new Map();
    array.forEach((v, i) => {
        sets.has(v) ? sets.set(v, sets.get(v) + 1) : sets.set(v, 1);
    })
    return sets;
}

function setAsTwo (str) {
    const result = [];
    let cutAsTwo = '';
    const checkHasntStr = /[^a-z]/gi;
    for (let i = 0; i < str.length; i++) {
        const cur = str[i];
        const next = str[i + 1];
        
        if (next) {
            cutAsTwo = cur + next;
            if (!cutAsTwo.match(checkHasntStr)) result.push(cutAsTwo.toUpperCase());
        };
    }        
    return result;
}