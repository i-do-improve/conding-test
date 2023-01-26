// 귤을 크기별로 분류했을 때 서로 다른 종류의 수를 최소화
// k = 한 상자에 담으려는 귤의 개수
// 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return

// 처음부터 끝까지 순회하면서 객채에 담음
// 키값에 따라 내림차순한 뒤 k에서 값을 빼면서 카운트


function solution(tangerine, k) {
    let answer = 0;
    const tangerineObj = tangerine.reduce((acc, cur) => {
        acc[cur] = acc[cur] + 1 || 1;
        return acc;
    }, {});

    const tangerineArr = Object.values(tangerineObj).sort((a, b) => b - a);

    for (const value of tangerineArr) {
        if (k <= 0) break;
        k = k - value;
        answer++;
    }

    return answer;
}

const tangerine = [1, 3, 2, 5, 4, 5, 2, 3]; // 2, 3, 5 2개씩 6개로 result 3
const k = 6;

console.log(solution(tangerine, k));

