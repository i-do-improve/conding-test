// 12:24 ~ 2:46
//  키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return
function solution(keyinput, board) {
    const [x, y] = board;
    const MAX = [Math.abs(Math.floor(x / 2)), Math.abs(Math.floor(y / 2))];
    
    return keyinput.reduce((acc, key) => {
        return getXY(acc, key, MAX);
    }, [0, 0]);
}

const getXY = (cur, direction, max) => {
    const [x1, y1] = max;
    const result = getDirection(direction, cur);
    return [limitMax(result[0], x1), limitMax(result[1], y1)];
}

const getDirection = (direction, cur) => { 
    const [x, y] = cur;
    switch (direction) {
        case 'left': return [x - 1, y];
        case 'right': return [x + 1, y];
        case 'up': return [x, y + 1];
        case 'down': return [x, y - 1];
    }
}

const limitMax = (value, max) => {
    return Math.abs(value) > max ? (value < 0 ? -max : max) : value;
}