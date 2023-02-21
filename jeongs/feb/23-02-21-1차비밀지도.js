function solution(n, arr1, arr2) {
  return arr1.map((v, i) => {
      const bit = (v | arr2[i]).toString(2).padStart(arr1.length, 0);
      
      return bit.split('').reduce((prev, cur) => {
          prev += cur === '1' ? '#' : ' ';
          return prev;
      },'')
      }
  )
}