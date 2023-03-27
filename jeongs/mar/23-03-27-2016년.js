// 2016년 1월 1일은 금요일
// 2016년 a월 b일은 무슨 요일?
function solution(a, b) {
    const week = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT'];
    // new Date(year, monthIndex(start 0), b);
    const date = new Date(2016, (a - 1), (b));
    const day = date.getDay();
    return week[day];
}