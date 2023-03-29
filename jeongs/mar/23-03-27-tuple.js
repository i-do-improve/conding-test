// 07:47 ~ (아놔 회사일하다가 다시 돌아옴) 9:34
// 순서 상관 X, 중복 X
// 튜플이 (2, 1, 3, 4)인 경우 이는 {{2}, {2, 1}, {2, 1, 3}, {2, 1, 3, 4}}}
function solution(s) {
  const result = [];
  const subsets = [];
  let tempSubset = '';
  
  for (let i = 0; i < s.length; i++) {
      // 숫자일 경우
      if (+s[i] === +s[i]) tempSubset += s[i];
      // ,이고, 다음이 숫자일 경우
      if (s[i] === ',' && +s[i + 1] === +s[i + 1]) {
          // tempSubset에 넣어줌
          tempSubset += s[i];
      } 
      // }일 경우
      if (s[i] === '}') {
          // tempSubset이 비어있지 않으면 subsets에 
          if (tempSubset !== '') subsets.push(tempSubset.split().join(',').split(','));
          tempSubset = '';
      }
  }

  // 여기까지 이중 배열 형태로 바꾼 상태.
  // {{2}, {2, 1}, {2, 1, 3}, {2, 1, 3, 4}}} -> [[2], [2, 1], [2, 1, 3], [2, 1, 3, 4]]

  subsets.sort((a, b) => { return a.length - b.length });
  // 길이가 많은 순으로 내림차순 -> [[2, 1, 3, 4], [2, 1, 3], [2, 1], [2]]
  
   // 이중 배열을 평탄화 시킨다음 new Set을 이용해 중복 제거
  return [...new Set(subsets.flatMap((item) => item).map(item => +item))];
}