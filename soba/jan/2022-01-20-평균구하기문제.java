public class 평균구하기문제 {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        answer = (answer / numbers.length);
        return answer;
        // -> return answer / number.length; : return에 바로 넣어주면 더 깔끔하다!
    }
}