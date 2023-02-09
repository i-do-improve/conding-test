// 10: 45 ~ 11:19
// 두 수의 짝꿍: 두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수
// 짝꿍이 존재하지 않으면, 짝꿍은 -1
// 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0

// X와 Y의 각 문자열을 돌면서 xMap, yMap에 키:개수로 저장한다
// 공통인 키 값의 최소값을 result에 push.
// 내림차순으로 변환 후 join해서 return
function solution(X, Y) {
    const xMap = getMap(X);
    const yMap = getMap(Y);
    const result = [];
    const xArray = Object.entries(xMap);
    xArray.forEach(([key, count]) => {
        if (yMap[key]) {
            let smaller = xMap[key] <= yMap[key] ? xMap[key] : yMap[key];
            
            while(smaller > 0) {
                result.push(key);
                smaller--;
            }
        }
    })
    
    return result.length === 0 ? '-1' : deleteLeftZeros(result.sort((a, b) => b - a).join(''));
}

const deleteLeftZeros = (string) => {
    return string.replace(/(^0+)/, "0"); 
}

const getMap = (string) => {
    const obj = {};
    for (const s of string) {
        obj[s] = obj[s] + 1  || 1;
    }
    return obj;
}