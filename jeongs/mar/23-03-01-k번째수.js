// 11: 10 ~ 11: 16 
// 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려
// [i, j, k]
function solution(array, commands) {
  return commands.map(([start, end, curIndex]) => array
    .slice(start - 1, end)
    .sort((a, b) => a - b)[curIndex - 1]
  )
}