package feb;

import java.util.Scanner;

// * 출력하기 문제이다
public class 직각삼각형출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "*";
            
        for(int i = 1; i < n + 1; i++){
            System.out.println(s);
            s = s + "*";
            // System.out.println("*".repeat(i)); , String 매서드 중 하나인 repeat()를 이용하면 더 간결하게 풀 수 있다.
        }
    }
}