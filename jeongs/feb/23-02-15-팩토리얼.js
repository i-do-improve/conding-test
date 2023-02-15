function solution(n) {
  const DFS = (n) => { 
    if (n === 1) return 1;
    return n * DFS(n - 1);
  }

  return DFS(n);
}

const n = 5;

console.log(solution(n));