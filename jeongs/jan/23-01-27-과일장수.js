// 과일 장수가 얻을 수 있는 최대 이익 return
// 한 상자의 가장 낮은 점수 사과 * 사과 m개
// 남는 사과 고려 x
// 이익이 발생하지 않는 경우 0 return

// 가능한 많은 사과
// 가능한 많은 이익 = 한 상자(m)에 최저 점수가 높아야 함

function solution(k, m, score) {
    let result = 0;
    score.sort((a, b) => b - a);
    
    for (let i = 0; i < score.length; i += m) {
        const box = score.slice(i, i + m);

        if (box.length < m) break;
        
        result += (Math.min(...box) * m);
    }
    
    return result;
}