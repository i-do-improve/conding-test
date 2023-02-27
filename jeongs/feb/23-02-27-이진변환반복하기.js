// x의 모든 0을 제거
// 제거 후의 길이를 2진법으로 바꾼 문자열로 변환
// s가 '1'이 될 때까지 반복
// [이진변환의 횟수, 변환과정에서 제거된 모든 0]

function solution2(s) {
  if (s === '1') return [1, 0];

  const DFS = (turn, sumZero) => {
      if (s === '1') {
          return [turn, sumZero];
      }

      let countZero = 0;
      let countOne = 0;
      
      for (const str of s) {
          str === '0' ? countZero++ : countOne++;
      }
      
      s = countOne.toString(2);
      
      return DFS(turn + 1, sumZero + countZero);
  }
  return DFS(0, 0);
}

function solution1(s) {
    
  let sumZero = 0;
  let turn = 0;
  
  if (s === '1') return [1, 0];
  
  while (s !== '1') {
      
      turn++;
      
      let countZero = 0;
      let countOne = 0;
      
      for (const str of s) {
          (str === '0') ? countZero++ : countOne++;
      }
      
      sumZero += countZero;
      s = countOne.toString(2);
  }
  
  return [turn, sumZero];
}