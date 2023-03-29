//문제 : i부터 j까지 k가 몇 번 등장하는지 return
//풀이 : valueOf()를 사용하여 Strng으로 변환하고 i부터j까지 k가 포함되어 있으면
//      while문으로 각 자릿수까지 포함되는지 모두 체크한다. 체크되는 만큼 ++하여 return
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String stringK = String.valueOf(k);
        
        for (int z = i; z <= j; z++) {
            String StringZ = String.valueOf(z);
           
            if (StringZ.contains(stringK)) {              
                int check=z;
                
                while(check != 0){
                    if(check%10==k){
                        answer++;
                        check /= 10;
                    } else {check /=10;}
                } 
            }
        }
        return answer;        
    }
}