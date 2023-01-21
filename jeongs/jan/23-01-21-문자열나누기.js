function solution(s) {
    const array = s.split('');
    let target = array[0];
    let counts = [0, 0];
    let result = 0;
    
    array.forEach((str, idx) => {
        if (counts[0] === counts[1] && counts[0] > 0 && counts[1] > 0) {
            result+= 1;
            target = str;
            counts = [0, 0];
        }

        (str === target) ? counts[0] += 1 : counts[1] += 1;
    })
    return result + 1;
}