// 5:13 ~ 5:30
// tangerine을 돌면서 dic에 저장
// 배열로 만든다음 k에서 빼면서 0이 되면 break; 
function solution(k, tangerine) {
  let result = 0;
  const countDups = tangerine.reduce((acc, tan) => {
    acc[tan] = acc[tan] + 1 || 1;
    return acc;
  }, {}); 
  
  for (const value of Object.values(countDups).sort((a, b) => b - a)) {
      k-=value;
      result++;
      if (k <= 0) break;
  }
  
  return result;
}