package kopo.programmers.level0;

public class SumCalculator {
    public static void main(String[] args) {
        /**
         * 두 수의 합
         *
         * 정수 num1과 num2가 주어질 때
         * num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
         */
        int num1 = 2, num2 = 3;
        System.out.println(solution(num1, num2));
    }

    static int solution(int num1, int num2) {
        return num1 + num2;
    }
}
