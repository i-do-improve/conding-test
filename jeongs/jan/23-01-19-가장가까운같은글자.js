// 1. 문자열을 for of 문으로 순회 (배열로 안만들어도 되는걸로 앎)
// 2. 현 위치에서 0번 index까지 순회하며 curIndex++, 같은 문자열이 있으면 result에 push, return; (return 되나?)

function solution(s) {
  let result = Array.from(Array(s.length)).map(() => -1);
  const sArray = s.split('');
  
  sArray.forEach((string, index) => {
      let sameStringOrder = 0;
      for (let step = index - 1; step >= 0; step--) {
          sameStringOrder++;
          if (string === sArray[step]) {
              result[index] = (sameStringOrder);
              return;
          }
      }
  })
  
  return result;
}