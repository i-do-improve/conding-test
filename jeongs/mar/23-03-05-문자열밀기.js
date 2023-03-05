// 12:14 ~ 12:29
function solution(A, B) {
  if (A === B) return 0;
  // A를 배열로 만들고 while문으로 A.length - 1만큼까지 반복한다.
  // pushCount를 1부터 시작하고 A.length -1까지 증가시킨다.
  // slice로 0부터 A.length - 1까지 자르고, 나머지를 잘라서 앞으로 붙인다.
  const arr = A.split('');
  let pushCount = 1;
  const cut = arr.slice(0, A.length - pushCount);
      const rest = arr.slice(A.length - pushCount);
  
  while (pushCount !== A.length) {
      const cut = arr.slice(0, A.length - pushCount);
      const rest = arr.slice(A.length - pushCount);
      const str = (rest.concat(cut)).join('');
      if (str === B) break;
      pushCount++;
  }
  return pushCount >= A.length? -1 : pushCount;
}