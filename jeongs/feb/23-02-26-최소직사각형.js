// 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return
// 지갑의 크기: w * h
// w와 h는 1 이상 1,000 이하인 자연수

// 모든 명함 수납이 가능해야 하므로 가로에 가장 큰 수 몰아놓고, 세로는 나머지 중 가장 큰 수로.

function solution(sizes) {
  return sizes
    .map(size => (size.sort((a, b) => b - a))) // 순회하며 좌측에 큰 수가 오도록 정렬
    .reduce((acc, [largeNum, smallNum]) => {
      acc[0] = largeNum > acc[0] ? largeNum : acc[0] // 기존 가로보다 순회 시 가로가 크다면 교체
      acc[1] = smallNum > acc[1] ? smallNum : acc[1] // 기존 세로보다 순회 시 세로가 크다면 교체
      return acc
    }, [0, 0])
    .reduce((acc, num) => {
      return acc *= num // 가로 * 세로
  }, 1)
}