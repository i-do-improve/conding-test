// 9:41
// n개의 자연수가 주어지면, 이 중 m 개를 뽑아 일렬로 나열하는 방법을 모두 출력.
function solution(arr, m) {
  const result = [];
  let item = Array.from({ length: m }, () => 0);
  let check = Array.from({ length: arr.length }, () => false);
  const DFS = (L) => { 
    if (L === m) { 
      result.push(...item);
      return;
    }
    for (let i = 0; i < arr.length; i++) { 
      if (check[i]) continue;
      item[L] = arr[i];
      check[i] = true;
      DFS(L + 1);
      check[i] = false;
    }
  }
  DFS(0);
  return result;
}

const m = 2;
const arr = [3, 6, 9];

console.log(solution(arr, m));