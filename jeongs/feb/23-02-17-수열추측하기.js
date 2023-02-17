function solution(n, f) {
  const check = Array.from({ length: n + 1 }, () => false);
  const combies = Array.from({ length: n }, (_, i) => getCom(n - 1, i));
  const permu = [];
  let answer = [];

  const DFS = (L, sum) => {
    if (answer.length === n || sum > f) return;
    if (L === n && sum === f) {
      answer = permu.slice();
      return;
    }
    for (let i = 1; i <= n; i++) { 
      if (check[i]) continue;
      check[i] = true;
      permu[L] = i; 
      DFS(L + 1, sum + (combies[L] * permu[L]));
      check[i] = false;
    }
  }
  DFS(0, 0);
  
  return answer;
}

const getCom = (n, r) => { 
  const memos = Array.from(Array(n + 1), () => Array(n + 1).fill(0));

  const DFS = (n, r) => { 
    if (memos[n][r]) return memos[n][r];
    if (n === r || r === 0) return 1;
    memos[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    return memos[n][r];
  }
  return DFS(n, r);
}

const n = 4;
const f = 16;

console.log(solution(n, f));