// 8:50 ~ 9:04
//  '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다
// 아무것도 없을 때 pop될 수도 있으므로 count가 -인지 아닌지도 세야 함
function solution(s){
    const stack = [];
    let count = 0;
    for (const str of s) {
        if (str === '(') {
            stack.push(str);
            count++;
            continue;
        }
        if (stack.length === 0 && str === ')') {
            stack.push(str);
            break;
        }
        stack.pop();
        count--;    
    }
    
    return stack.length === 0 && count === 0;
}