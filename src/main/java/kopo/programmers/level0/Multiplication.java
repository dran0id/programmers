package kopo.programmers.level0;

public class Multiplication {
    public static void main(String[] args) {
        /*
        두 수의 곱 구하기

        정수 num1, num2가 매개변수 주어집니다.
        num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
         */
        int num1 = 2, num2 = 4;
        System.out.println(solution(num1, num2));
    }

    static int solution(int num1, int num2) {
        return num1 * num2;
    }
}
