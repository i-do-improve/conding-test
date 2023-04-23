// 12:08 ~ 12:09
function solution(my_string) {
    return my_string
        .split('')
        .reduce((acc, word) => {
        acc += (Number(word)) ? Number(word) : 0;
        return acc;
    }, 0);
}