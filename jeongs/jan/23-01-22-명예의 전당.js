// k = 명예의 전당 점수 개수
// k일 다음부터는 마지막 점수가 추가될 점수보다 높으면 추가될 점수가 그자리를 대체.
function solution(k, score) {
    const kScore = [];
    
    return score.map((value, idx) => {
        if (idx < k) {
            kScore.push(value);
        }
        const lastScore = kScore[k - 1];
        if (lastScore < value) {
            kScore[k - 1] = value;
        }
        kScore.sort((a, b) => b - a);
        return kScore[kScore.length - 1];
    })
}