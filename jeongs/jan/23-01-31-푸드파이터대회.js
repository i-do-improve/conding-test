// 19분 start 43분 stop
// 매 대결마다 음식의 종류와 양이 바뀝니다
// 한 선수는 제일 왼쪽에 있는 음식부터 오른쪽으로, 다른 선수는 제일 오른쪽에 있는 음식부터 왼쪽으로 순서대로 먹는 방식
// food[0]은 물 = 1
// 중앙에 물을 먼저 먹는 사람 승

//  조건 안지켜서 몇 개의 음식은 대회에 사용하지 못하게 됨 -> 모든 음식을 return하는 건 아님
// 정답의 길이가 3 이상인 경우만 입력으로 주어집니다.

function solution(food) {
    const origin = food.reduce((array, amount, index) => {
        const pushCount = Math.floor(amount / 2);
        if (index === 0 || pushCount < 1) {
            return array;
        }
        
        for (let i = 0; i < pushCount; i++) {
            array.push(index);
        }
        return array;
    }, []);
    
    const reversed = origin.slice().reverse();
    
    return [...origin, 0].concat(reversed).join('');
}