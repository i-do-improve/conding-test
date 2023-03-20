// 10:35 ~ 11: 25
// 두 직선의 평행 조건: 기울기가 같은 경우.
// 임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다 = 수직, 수평인 경우는 없다. = 무조건 기울기가 있다.
// 두 직선이 겹치는 경우(일치하는 경우)에도 1을 return : 어차피 기울기가 같으면 1이기 때문에 y절편까지 확인할 필요 x

function solution(dots) {
    // dots 배열에서 네 개의 점을 꺼낸다
    const [p1, p2, p3, p4] = dots;
    
    const slope = getSlope(p1, p2);
    const slope2 = getSlope(p3, p4);
    
    // 두 직선이 평행한 경우
    if (slope === slope2) return 1;
    
    // p1 - p3, p2 - p4 조합도 비교
    const slope3 = getSlope(p1, p3);
    const slope4 = getSlope(p2, p4);
    
    if (slope3 === slope4) return 1;
    return 0;
}

const getSlope = (p1, p2) => {
    const [x1, y1] = p1;
    const [x2, y2] = p2;
    const slope = (y2 - y1) / (x2 - x1);
    
    return slope;
}
