// 8:58 ~ 9:00
function solution(absolutes, signs) {
  return absolutes.reduce((acc, absolute, idx) => {
      acc += signs[idx] ? absolute : - absolute;
      return acc;
  }, 0)
}