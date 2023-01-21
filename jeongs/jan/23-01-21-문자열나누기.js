function solution(s) {
    const array = s.split('');
    let target = array[0];
    let counts = [0, 0];
    let result = 0;
    
    array.forEach((str, idx) => {
        if (counts[0] === counts[1] && counts[0] > 0 && counts[1] > 0) {
        // counts[0] === counts[1] && 각각이 1이상일 때,
            result+= 1;
            target = str;
            counts = [0, 0];
        }
        if (str === target) {
        // 현재 값이 타겟일 때,
            counts[0]+= 1;
            return;
        }
        // 현재 값이 타겟이 아닐 때,
        if (str !== target) {
            counts[1]+= 1;
        }
    })
    return result + 1;
}