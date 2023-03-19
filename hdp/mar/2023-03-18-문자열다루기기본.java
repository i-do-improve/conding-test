/**
 * 문자열다루기 기본
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수
 * 예외를 체크해서 false를 반환하고 예외에 걸리지 않으면 true를 반환하면 될 것 같다고 생각했다.
 */
class Solution {
	public boolean solution(String s) {
		boolean answer = true;
		if(s.length()!=4 && s.length()!=6){ //문자열길이 4나 6이 아니면 false
			return false;
		}
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)<'0'||s.charAt(i)>'9'){   //숫자가 아니면 false
				return false;
			}
		}
		return answer;
	}
}

/**
 * 다른 사람의 풀이.
 * 간결하다. String.matches(정규표현식);을 이용했다. . .
 * 정규표현식 .. ^은 시작, [0-9]는 0~9까지 숫자만, *는 0개 이상 반복(없어도 됨), $는 끝을 의미.
 */
/*
import java.util.*;
class Solution {
	public boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
		return false;
	}
}
 */