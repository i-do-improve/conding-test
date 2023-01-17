// 개인정보는 유효기간 전까지만 보관 가능, 이후엔 파기
// 오늘 날짜로 파기해야 할 개인정보 번호들을 구하려 함
// 모든 달은 28일까지

// 오늘 날짜를 의미하는 문자열 today, 
// 약관의 유효기간을 담은 1차원 문자열 배열 terms와 
//  수집된 개인정보의 정보를 담은 1차원 문자열 배열 privacies가 매개변수로 주어집니다.
//  이때 파기해야 할 개인정보의 번호를 오름차순으로 1차원 정수 배열

// 1. 오늘 날짜를 ms로 변환 -> 모든 달이 28일이어서 계산이 안맞는 것 같음. 따로 초를 변환하는 함수를 만들어야 할 듯
// 2. privacies 순회하며 조건에 맞으면 push

function solution(today, terms, privacies) {
  const result = [];
  const condition = getTime(today);

  const arrayTerms = terms.reduce((prev, cur) => {
    prev.push(cur.split(' '));
    return prev;
  }, []);

  privacies.forEach((privacy, index) => { 
    const [info, term] = privacy.split(' ');
    const infoTime = getTime(info);

    const getLimit = arrayTerms.find(([arrayTerm]) => term === arrayTerm);
    const [limitTerm, month] = getLimit;
    
    const monthToTime = month * (28 * 24 * 60);

    if (infoTime + monthToTime <= condition) { 
      result.push(index + 1);
    }
  })

  return result;
}

const getTime = (dateString) => {
  const [year, month, day] = dateString.split('.');
  const yearToTime = year * (12 * 28 * 24 * 60);
  const monthToTime = month * (28 * 24 * 60);
  const dayToTime = day * (24 * 60);

  return yearToTime + monthToTime + dayToTime;
}

const today = '2020.01.01';
const terms = ["Z 3", "D 5"];
const privacies = ["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"];

console.log(solution(today, terms, privacies), 'solution');