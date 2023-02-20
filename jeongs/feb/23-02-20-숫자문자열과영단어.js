// 5: 36 ~ 5:43
// s를 하나씩 돌면서 숫자면 바로 답에 넣어주고, 아닐 경우 word 문자열에 합침.
// 합친 후 numbers 배열에 키로 있다면 해당 숫자를 반환해서 답에 추가
function solution(s) {
    
  let answer = '';
  
  const numbers = {
      'zero': 0, 
      'one': 1, 
      'two': 2,
      'three': 3, 
      'four': 4, 
      'five': 5,
      'six': 6, 
      'seven': 7, 
      'eight': 8,
      'nine': 9,
  };
  
  let word = '';
  
  for (const str of s) {
      if (Number.isInteger(+str)) {
          answer += str;
          continue;
      }
      word += str;
      if (numbers.hasOwnProperty(word)) {
          answer += numbers[word];
          word = '';
      }
  }
  
  return +answer;
  
}