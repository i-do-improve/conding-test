// 11:15 ~ 11:26
//  각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬
function solution(strings, n) {
    return strings.sort((stringA, stringB) => {
        const a = stringA.split('')[n];
        const b = stringB.split('')[n];
        return (a === b) ? stringA.localeCompare(stringB) : a.localeCompare(b);
    })
}