// 7:24 ~ 7:27
function solution(s) {
    const arr = s.split(' ');
    return arr.reduce((acc, num, idx) => acc + (num === 'Z' ? - Number(arr[idx - 1]) : Number(num)),0);
}