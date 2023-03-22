// 8:55 ~ 9:01
// 아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return
// 아이디가 일치하는 회원이 없다면 “fail”
// 아이디만 일치할 때 "wrong pw"

// 회원들의 비밀번호는 같을 수 있다
function solution(id_pw, db) {
    // for of 문으로 특정 조건 만족시 중간에 return;
    for (const data of db) {
        const [curId, curPw] = data;
        const [id, pw] = id_pw;
        if (id === curId && pw === curPw) return 'login';
        if (id === curId) return 'wrong pw';
    }
    return 'fail';
}