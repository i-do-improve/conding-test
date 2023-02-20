function solution(progresses, speeds) {
    
  const deploy = progresses.map((progress, i) => Math.ceil((100 - progress) / speeds[i] ));
  const answer = [1];
  let maxDay = deploy[0];
  
  for (let curIndex = 1, day = 0; curIndex < speeds.length; curIndex++) {
      const curDeploy = deploy[curIndex];
      if (curDeploy > maxDay) {
          answer[++day] = 1;
          maxDay = curDeploy;
      } else {
          answer[day] += 1;
      }
  }
  
  return answer;
}