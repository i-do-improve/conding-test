// 순서: 빵(1) - 야채(2) - 고기(3) - 빵(1)
// 상수가 포장하는 햄버거의 개수를 return

// while문 돌 필요없이 stack에 현재 요소 push.
// stack[stack.length -1]이 마지막 요소이므로, 마지막부터 4개가 1, 2, 3, 1인지 확인.
// 4개가 1, 2, 3, 1이면 stack에서 4개 pop.

function 맞은풀이(ingredient) {
    let result = 0;
    const stack = [];
    
    ingredient.forEach((item) => {
        stack.push(item);
        
        if (stack[stack.length - 4] === 1 
            && stack[stack.length - 3] === 2
            && stack[stack.length - 2] === 3
            && stack[stack.length - 1] === 1) {
            for (let i = 0; i < 4; i++) {
                stack.pop();
            }
            result++;
        }    
    })
    
    return result;
}

// 순서: 빵(1) - 야채(2) - 고기(3) - 빵(1)
// 상수가 포장하는 햄버거의 개수를 return

// while문으로 돌면서 현재 요소가 1일경우의 index를 저장,
// 바로 다음 요소가 이전 요소의 index + 1이 아닐 경우 continue;
// 다음 2인 요소, 3인 요소, 1인 요소의 index 저장
// splice로 각 index + 1을 자름.
// 다시 while문이 처음부터 돌면서 위 로직을 반복.

function 실패코드(ingredient) {
    let result = 0;
    let index = 0, burgerIndex = 0;
    const burger = [1, 2, 3, 1];
    let indexArray = [];
    
    while (index < ingredient.length && ingredient.length > 3) {
        const init = ingredient[index] === 1 && indexArray.length === 0 && ingredient[index + 1] === 2;
        const fromSecondToLast = indexArray[burgerIndex - 1] === index - 1 && ingredient[index] === burger[burgerIndex];
        if (init || fromSecondToLast) {
            indexArray[burgerIndex] = index;
            burgerIndex++;
        }
        
        index++;
        if (indexArray.length === burger.length) {
            ingredient.splice(indexArray[0], 4);
            index = 0;
            burgerIndex = 0;
            indexArray = [];
            result++;
        }
    }
    
    return result;
}

const ingredient = [2, 1, 1, 2, 3, 1, 2, 3, 1];
// const ingredient = [1, 3, 2, 1, 2, 1, 3, 1, 2];
console.log(맞은풀이(ingredient));