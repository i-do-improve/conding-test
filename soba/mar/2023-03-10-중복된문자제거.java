package mar;

class 중복된문자제거 {
    public String solution(String my_string) {
        
        String answer = "";


        /*
        indexOf() 의 특징 : 파라미터에 문자를 넣으면 해당하는 문자가 위치한 인덱스를 반환하는데, 여기서
        가장 처음 일치하는 인덱스 번호만을 반환. 고로 중복된 문자를 제거하는데 성능이 탁월
         */
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.indexOf(my_string.charAt(i)) == i){
                answer += my_string.charAt(i);
            }
        }
       
        
        return answer;
    }
}