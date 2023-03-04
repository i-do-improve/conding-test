function solution(array) {
  return array.reduce((acc, cur) => 
      acc + String(cur).split('').filter((item) => item === '7').length
  , 0);
}