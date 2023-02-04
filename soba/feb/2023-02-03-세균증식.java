public class 세균증식 {

    // 나는 while문을 통해 풀었다.
    class Solution1{
        public int solution1(int n, int t) {

            int i = 0;

            while(true){
                n = n * 2;
                i++;

                if(i == t){
                    break;
                }
            }
            return n;
        }
    }


    /*쉬프트 연산자를 이용한 풀이, 
    쉬프트 연산자는 피연산자를 2진수로 표현하였을 때 수를 << , >> 방향 대로 각각 1씩 이동시키는 역할을 한다
    중요한 건 이것이 뭘 의미하느냐, 비트들이 왼쪽으로 한칸씩 이동하면 2만큼 곱해주는 효과를 가진다
    따라서 5 << 1 이면 10으로 바뀌고 5 << 2 면 20으로 바뀐다. 
    반대로 20 >> 1 이면 10, 20 >> 2 이면 다시 5로 돌아온다.
    그렇기에 쉬프트 연산자는 2의 거듭제곱수를 곱셈해주거나 나눗셈해주는 기능을 가진다*/
    class Solution {
        public int solution(int n, int t) {
            int answer = 0;

            answer = n << t;

            return answer;
        }
    }





}