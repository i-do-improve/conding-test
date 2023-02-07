

// 10:13
// 각 원소들에 대해 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수
// 뒷 큰수가 존재하지 않는 원소는 -1

// numbers길이가 백만이다보니까 자칫하면 엄청 느려질듯
// while문 하나로 합의보자. i = 0, j = i로 초기화
// i < numbers.length 일때까지 순회
// 만약 j >= numbers.length이면 i++, j = i
// number[j] > number[i]이면 result.push. continue;
// 반복문 한개로 돌려도 20번부터 시간초과가 뜬다.

function 실패코드1(numbers) {
    const result = [];
    let i = 0, j = i + 1;
    
    while (i < numbers.length) {
        if (numbers[j] > numbers[i]) {
            result.push(numbers[j]);
            i++;
            j = i + 1;
            continue;
        }
        j++;
        
        if (j > numbers.length - 1) {
            result.push(-1);
            i++;
            j = i + 1;
        }
    }
    
    return result;
}