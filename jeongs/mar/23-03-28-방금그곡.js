// 6:40 ~ 7:51
// 방금 그곡: 음악 제목, 재생이 시작되고 끝난 시각, 악보
// 악보에 사용되는 음: C, C#, D, D#, E, F, F#, G, G#, A, A#, B 12개
// 각 음은 1분에 1개씩 재생
  //  음악 길이보다 재생된 시간이 길 때는 음악이 처음부터 반복해서 재생
  // 음악 길이보다 재생된 시간이 짧을 때는 처음부터 재생 시간만큼만 재생
// 결과가 여러개일 땐 재생된 시간이 제일 긴 음악 제목을 반환.  > 이것도 같으면 먼저 입력된 순.
// 없을 때에는 “(None)”을 반환
function solution(m, musicInfos) {
    // m: 네오가 기억한 멜로디
    // musicinfo:  음악이 시작한 시각, 끝난 시각, 음악 제목, 악보 정보
    
    const setMusic = {};
    const answer = ['title', 0];
    
    m = replace(m);
    
    for (let i = 0; i < musicInfos.length; i++) {
        const info = replace(musicInfos[i]); // 소문자로 일괄 변환
        const [start, end, title, melody] = info.split(',');
        
        // 재생 시간 구하기
        const playTime = Math.abs((+(start.slice(0, 2) - +end.slice(0, 2)) * 60)) + (+end.slice(3, 5) - +start.slice(3, 5));
        
        let j = 0;
        let count = 0;
        let playMusic = '';
        
        // 혹시나 재생 시간이 더 길어질 수도 있으니 playTime만큼 문자열 늘리기 
        while (j < playTime) { 
            playMusic += melody[count];
            if (count === melody.length - 1) {
                count = 0;
            }
            else {
                count++;
            }
            j++;
        }
        
        if (playMusic.includes(m)) {
            setMusic[title] = playMusic.length;
        }
    }
    
    const setMusicLen = Object.keys(setMusic).length;
    
    // 답이 여러개일 때
    if (setMusicLen > 1) { 
        for (let key in setMusic) {
            // 기존 곡 길이보다 클 클 경우
            if (setMusic[key] > answer[1]) { 
                answer[0] = key; // title 저장
                answer[1] = setMusic[key]; // 곡 길이 저장
            }
        }
        return answer[0];
    } else if (setMusicLen === 1) {
        for (let key in setMusic) {
            return key;
        }
    } else return '(None)'
    
}

const replace = (str) => {
    str = str.replace(/C#/g, 'c');
    str = str.replace(/D#/g, 'd');
    str = str.replace(/F#/g, 'f');
    str = str.replace(/G#/g, 'g');
    str = str.replace(/A#/g, 'a');
    str = str.replace(/E#/g, 'e');
    
    return str;
}