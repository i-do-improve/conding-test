// 10:20 ~ 10:51
// priorities map을 돌려서 { priority, index } 형태로 다시 만듦.
// while문을 돌린다 (prioritiesHasIndex에서.length || stack[stack.length - 1].priority !== target)
// prioritiesHasIndex에서 shift로 j를 꺼낸다.
// 나머지 priorities에서 J보다 중요도가 높은게 존재할 경우 J를 다시 Push. 아닐 경우 J를 인쇄.
// 

function solution(priorities, location) {
    const print = [];
    const target = priorities[location];
    const prioritiesHasIndex = priorities.map((priority, index) => ({ priority, index: index + 1 }));
    while (print[print.length - 1]?.priority !== target ||  print[print.length - 1]?.index - 1 !== location) {
        const J = prioritiesHasIndex.shift();
        const hasBiggerImportance = prioritiesHasIndex.some(({ priority }) => priority > J.priority);
        ( hasBiggerImportance ) ? prioritiesHasIndex.push(J) : print.push(J);
    }
    return print.length;
}
