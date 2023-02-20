// 완주하지 못한 선수의 이름을 return
// 참가자 중에는 동명이인이 있을 수 있습니다.

// participant, completion를 사전순으로 정렬
// 순회하면서 같은 index 요소의 이름이 같지 않으면 답.

function solution(participant, completion) {
  let answer = '';

  participant.sort();
  completion.sort();

  for(let i = 0; i < participant.length; i++){
      if(participant[i] !== completion[i]){
          answer = participant[i];
          
          break;
      }
  }

  return answer;
}