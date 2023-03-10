// 11:12 ~ 11:25
// spell 사용된 알파벳을 '한번씩만' '모두' 사용한 단어가 있다면 1, 아니면 2 리턴
// spell의 크기가 크지 않으므로 includes 써도 될듯
function solution(spell, dic) {
    let hasAllUsed = false;
    for (const word of dic) {
        // 애초에 spell의 길이와 다르면 false
        if (spell.length > dic.length) continue;
        let hasAlp = true;
        
        for (const alp of spell) {
            if (!word.includes(alp)) {
                hasAlp = false;
                break;
            }
        }
        
        if (hasAlp) {
            hasAllUsed = true;
            break;
        }
    }
    return hasAllUsed ? 1 : 2;
}