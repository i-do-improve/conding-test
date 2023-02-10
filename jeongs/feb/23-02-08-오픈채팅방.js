// 11:16 ~ 11:41
// 닉네임을 변경하는 방법
    // 나간 후, 새로운 닉네임으로 다시 들어감
    // 채팅방에서 닉네임을 변경
    // 닉네임을 변경할 때는 기존에 채팅방에 출력되어 있던 메시지의 닉네임도 전부 변경
// 채팅방은 중복 닉네임을 허용

// record를 돌면서 const [status, userId, nickname] = split(' ');
    // result.push
// const users = { [userId]: [nickname] };

// Enter: 님이 들어왔습니다.
// Leave: 님이 나갔습니다.
// Change일 경우, users[userId] = newNickname;
// 
function solution(record) {
    const statusMap = {
        'Enter': '님이 들어왔습니다.',
        'Leave': '님이 나갔습니다.',
    };
    const users = {};
    const result = [];
    
    record.forEach((sentence) => {
        const [status, userId, nickname] = sentence.split(' ');
        if (status === 'Enter' || status === 'Change') {
            users[userId] = nickname;
        };
        if (statusMap[status]) {
            result.push(`${userId}  ${statusMap[status]}`);
        }
    })
    return result.map((message) => {
        const [userId, status] = message.split('  ');
        return `${users[userId]}${status}`;
    })
}