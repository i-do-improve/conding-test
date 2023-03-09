// 11:30 ~ 11:33
function solution(s) {
    const arr = s.split(' ').map((item) => Number(item));
    return `${Math.min(...arr)} ${Math.max(...arr)}`;
}