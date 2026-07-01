package kopo.programmers.level0;

public class SubtractCalculator {
    public static void main(String[] args) {
    /*
    두 수의 차 구하기

    정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록
    solution 함수를 완성해주세요.
    */
        int num1 = 2, num2 = 3;

        System.out.println(solution(num1, num2));
    }

    static int solution(int num1, int num2) {
        int answer;
        answer = num1 - num2;

        return answer;
    }
}
