// 10:40 ~ 11: 10
// 1. 문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
// 2. z를 넘어갈 경우 다시 a로
// 3. skip에 있는 알파벳은 제외하고 건너뜁니다.

// 각 알파벳을 배열에 담음 = alphabets
// s를 split해서 for 문으로 돌기.
// alphabets 배열에서 findIndex 한다음, 해당 index부터 다시 for문으로 돌기
// 만약 alphabet이 skip에 includes라면 continue, index++ 하면서 찾고 result+=


function solution(s, skip, index) {
  console.log('test');
  const alphabets = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'];
const skips = skip.split('');
let result = '';

for (let i = 0; i < s.length; i++) {
    const sItem = s[i];
    let currentIndex = 0;
    let foundIndex = alphabets.findIndex((alphabet) => alphabet === sItem);
    
    while (true) {
        const nextItem = alphabets[foundIndex++];
        if (foundIndex >= alphabets.length) {
            foundIndex = 0;
        }
        if (skips.includes(nextItem)) continue;
        if (currentIndex === index) {
            result += nextItem;
            break;
        };
        currentIndex++;
    }
}

return result;
  
}