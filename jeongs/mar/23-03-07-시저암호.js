// 12:15 ~ 12:34
function solution(s, n) {
  return s.split('').reduce((acc, cur) => {
      const charCode = cur.charCodeAt();
      if (65 <= charCode && 90 >= charCode) {
          acc.push(calc(90, n, charCode));
      }
      if (97 <= charCode && 122 >= charCode) {
          acc.push(calc(122, n, charCode));
      }
      if (cur === ' ') {
          acc.push(' ');
      }
      return acc;
  }, []).join('');
}

const calc = (max, n, cur) => String.fromCharCode((cur + n > max) ? (cur - 26 + n) : (cur + n));
