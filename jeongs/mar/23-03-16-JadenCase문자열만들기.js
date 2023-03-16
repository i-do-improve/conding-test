// 9:19 ~ 9:33
// JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열
// 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로
// 공백문자가 연속해서 나올 수 있습니다
// + 대문자가 중간에 올 수 있음.

// 1. split(' ')로 공백문자로 자른다
// 2. 각 strings의 0번째 문자와 나머지를 slice로 분리. + 나머지를 toLowerCase()로 소문자로 변환.
// 3. 0번째 인덱스가 숫자면 나머지와 그대로 붙이고, undefined일 경우 ' '로, 아닐 경우 toUpperCase.
// 4. join('')

function solution(s) {
    return s.split(' ').map((strings) => {
        if (strings.length === 0) {
            return '';
        }
        
        const firstStr = strings[0];
        const restStr = strings.slice(1);
        
        return ((Number(firstStr)) ? firstStr : firstStr.toUpperCase()) + restStr.toLowerCase()
    }).join(' ')
}