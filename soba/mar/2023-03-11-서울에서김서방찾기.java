package mar;

class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String name = "";
        
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                name += i;
                // == 는 주소값을 비교하는 연산자이고, equals()는 주소 안의 데이터 값을 비교하는 메서드
                // break; 하면 찾은 즉시 반환하여 효율적
                // Object.equals()를 사용하면 Null을 체크하기 때문에 NullPointerException이 발생하지 않음
            }
        }
        String answer = "김서방은 " + name +"에 있다";
        
        
        return answer;
    }
}