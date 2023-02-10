// 1 ~ n까지 번호가 적힌 구슬이 있다. 이 중 중복을 허락하여 m번을 뽑아 일렬로 나열하는 방법을 모두 출력하라.
// n: 3, m: 2일 때, 1 1, 1 2, 1 3, 2 1, 2 2, 2 3, 3 1, 3 2, 3 3 = 총 9가지
// 3 * 3 = 9

function solution(n, m) { 
  const result = [];
  const temp = Array.from({ length: m }, () => 0);

  const DFS = (L) => { 
    if (L === m) {
      result.push(temp.slice());
    } else {
      for (let i = 1; i <= n; i++) {
        temp[L] = i;
        DFS(L + 1);
      }
    }
  }
  DFS(0);
  console.log(result);
}



const n = 3;
const m = 2;

console.log(solution(n, m));