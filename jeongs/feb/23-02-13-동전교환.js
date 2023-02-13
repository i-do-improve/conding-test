// 다음과 같이 여러 단위의 동전들이 주어져 있을 때, 거스름돈을 가장 적은 수의 동전으로
// 교환해주려면 어떻게 주면 되는가? 각 단위의 동전은 무한정 쓸 수 있다.

function solution(coins, change) {
  let result = Number.MAX_SAFE_INTEGER;

  const DFS = (count, sum) => {
    if (sum > change || count >= result) return;
    if (sum === change) {
      result = Math.min(result, count);
      return;
    }

    for (let i = 0; i < coins.length; i++) {
      DFS(count + 1, sum + coins[i]);
    }
  }

  DFS(0, 0);
  return result;
}

const coins = [1, 2, 5];
const change = 15;

console.log(solution(coins, change));

