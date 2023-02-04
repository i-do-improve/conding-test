//문제 설명
// 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 
// 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, 
// n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

// 피자 조각 slice, 먹는 사람 n
//최소 한 조각씩 먹기 위해서 최소 몇판인지 (남은조각은 필요없음)
//n명이 slice로 자른피자를 먹기위해선 최소 answer판
int solution(int slice, int n) {
    int answer = 0;
    int x = n / slice;
    
    if(n%slice == 0){ //answer판으로 딱 떨어질 때 
        answer= x;
    }else if(n%slice != 0){ // answer판으로 부족할 때
        answer= x+1;
    }
    
    return answer;
}