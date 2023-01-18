// 부분 문자열, 작거나 같은 수가 나오는 횟수 return
// 1. 문자열을 순회하며 p length 만큼 끊음.
// 2. 해당 숫자가 p보다 작거나 같으면 result++
function solution(t, p) {
  let result = 0;
  for (step = 0; step < t.length; step++) {
      const cutString = t.slice(step, step + p.length);
      
      if (cutString.length !== p.length) continue;
      
      if (Number(cutString) <= Number(p)) {
          result++;
      }
  }
  
  return result;
}