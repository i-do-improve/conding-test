function solution(n, t) {
    const DFS = (L, sum) => {
        if (L === t) {
            return sum * 2;   
        }
        
        return DFS(L + 1, sum * 2);
    }
    
    return DFS(1, n);
}
