// 10:03 ~ 10:08
// n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치
function solution(numlist, n) {
    return numlist.sort((a, b) => {
        const distance = Math.abs(a - n) - Math.abs(b - n);
        return distance === 0 ? b - a : distance;
    })
}