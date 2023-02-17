//머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 
//그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 
//문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
//모스부호는 다음과 같습니다.

//morse = { 
//     '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
//     '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
//     '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
//     '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
//     '-.--':'y','--..':'z'
// }

//모스부호를 원소로 갖는 morse배열과 영어 소문자를 원소로 갖는 sample 배열 선언 및 초기화 
//입력된 모스부호는 공백을 기준으로 분리하여 letterSplit배열에 저장
//letterSplit배열의 원소 수만큼 반복문을 돌려서 모스부호와 일치할 경우 
//해당 모스부호와 같은 모스배열의 인덱스값과 일치하는 sample 배열의 인덱스값에
//위치하는 값으로 answer에 변환.

class Solution {
    public String solution(String letter) {
        //String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                      ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                      "...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] sample = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                         'o','p','q','r','s','t','u','v','w','x','y','z'};

        String[] letterSplit = letter.split(" ");  // 입력된 모스부호 분리하고 data 배열에 저장
        StringBuilder answer = new StringBuilder();  
        // 변환된 문자열을 저장 하기 위해 StringBuilder를 사용하면 가변가능한 문자열 생성가능
    
        for (int i = 0; i < letterSplit.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (letterSplit[i].equals(morse[j])) {
                    answer.append(sample[j]);
                    break;
                }
            }
        }
        return answer.toString();
    }
}