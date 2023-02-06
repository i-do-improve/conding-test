// 9:51 ~ 10: 22
// 실패율: 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
// 실패율이 높은 스테이지부터 내림차순으로 "스테이지의 번호"가 담겨있는 배열을 return 
// 만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록.
// 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0

// unClear: while이 1(index)부터 돌면서 stages.filter(stage === index).length
// clear: stages.length - unClear
// failureSet: [index, unClear / clear]
// failureSet을 돌면서 ([aIndex, aFailure], [bIndex, bFailure]) => bFailure - aFailure > 0 ? bFailure - aFailure : aFailure - bFailure
// 마지막 map으로 Index만 뽑기

function solution(N, stages) {
    let index = 1;
    let clear = stages.length;
    const failureSet = [];
    while(index <= N) {
        const unClear = stages.filter((stage) => stage === index).length;
        failureSet.push([index, unClear / clear]);
        clear -= unClear;
        index++;
    }
    failureSet.sort(([aIndex, aFailure], [bIndex, bFailure]) => bFailure - aFailure === 0  ? aFailure - bFailure:  bFailure - aFailure);
    
    return failureSet.map(([index, failure]) => index);
}