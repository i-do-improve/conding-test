// 11:40 ~ 11:53
// 금액: price * n
// 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return
function solution(price, money, count) {
  // 3 x 1 + 3 x 2 + 3 x 3 + 3 x 4 = 3 x (1 + 2 + 3 + 4) = 3 x 10 = 30
  // 식: price * (1 ~ count) = totalPrice
  // 답: totalPrice - money
  const totalPrice = price * ((count * (count + 1)) / 2);
  return  totalPrice - money > 0 ? totalPrice - money : 0;
}