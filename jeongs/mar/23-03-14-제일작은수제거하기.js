function solution(arr) {
    return arr.length === 1 ? [-1] : arr.filter((item) => item !== Math.min(...arr));
}

const arr = [10];
console.log(solution(arr));
