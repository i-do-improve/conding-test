// while문을 돌린다 (prioritiesHasIndex에서.length || stack[stack.length - 1].priority !== target)
// prioritiesHasIndex에서 shift로 j를 꺼낸다.
// 나머지 priorities에서 J보다 중요도가 높은게 존재할 경우 J를 다시 Push. 아닐 경우 J를 인쇄.
// 

function solution(priorities, location) {
    const print = [];
    const target = priorities[location]; // location에 위치하는 target이 무엇인지 찾음.
    const prioritiesHasIndex = priorities.map((priority, index) => ({ priority, index: index + 1 })); // map을 돌려서 { priority, index } 형태로 다시 만듦.

    while (print[print.length - 1]?.priority !== target || print[print.length - 1]?.index - 1 !== location) {
        // while 문은 print에 들어간 마지막 요소가 target이고, index가 location과 같으면 정지. (target인데 중복된 priority일 수도 있으니까 Index도 체크해주는 것.)
        const J = prioritiesHasIndex.shift(); // 맨 앞 요소 뽑음
        const hasBiggerImportance = prioritiesHasIndex.some(({ priority }) => priority > J.priority); // J보다 현재 priority가 높은지 체크
        ( hasBiggerImportance ) ? prioritiesHasIndex.push(J) : print.push(J); // 높다면 J를 맨뒤로 아닐 경우 print로 push.
    }

    return print.length; // while문이 print에 target이 들어갈 경우 stop하므로, print의 length를 체크하면 답.
}
