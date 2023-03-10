function solution(n, t) {
    const DFS = (L, sum) => {
        return (L === t) ? sum * 2 : DFS(L + 1, sum * 2);
    }
    
    return DFS(1, n);
}
