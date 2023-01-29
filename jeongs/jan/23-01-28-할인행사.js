// 10일 동안 회원 자격을 부여
// 회원을 대상으로 매일 한 가지 제품을 할인하는 행사 -> 할인하는 제품은 하루에 하나씩만 구매
//  자신이 원하는 제품, 수량이 "할인하는 날짜"와 10일 연속으로 일치

//  회원등록시 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수를 return

// index부터 index + 10까지 순회하면서, filter의 want의 number 이상일 때 length 체크.
// 맞다면 result++, 하나라도 틀리면 continue;
// 모든 want의 개수 조건을 만족해야 함.

function solution(want, number, discount) {
    let result = 0;
    for (let i = 0; i < discount.length; i++) {
        const cut10Day = discount.slice(i, i + 10);
        if (cut10Day.length !== 10) break;
        let flag = true;
        
        for (let j = 0; j < want.length; j++) {
            const count = cut10Day.filter((discountItem) => discountItem === want[j]).length;
            if (count < number[j]) {
                flag = false;
                break;
            }
        }
        
        if (flag) result++;
    }
    
    return result;
}