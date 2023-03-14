// 10:52 ~ 10:55
function solution(arr) {
    const stack = [];
    arr.forEach((num) => {
        if (num !== stack[stack.length - 1]) {
            stack.push(num);
        }
    })
    
    return stack;
    
}