// nCr = n개 중 r개를 "뽑는" 방법
function solution(n, r) {
  const memos = Array.from(Array(n + 1), () => Array(n + 1).fill(0));
;
  const DFS = (n, r) => { 
    if (memos[n][r] > 0) return memos[n][r];
    if (n === r || r === 0) { 
      return 1;
    }
    memos[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    return memos[n][r];
  }

  return DFS(n, r, 0);
}

const n = 33;
const r = 19;

console.log(solution(n, r));