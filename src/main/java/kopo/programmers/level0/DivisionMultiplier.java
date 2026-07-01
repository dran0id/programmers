package kopo.programmers.level0;

public class DivisionMultiplier {
    public static void main(String[] args) {
        /*
        두 수의 나눗셈

        정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후
        정수 부분을 return 하도록 solution 함수를 완성해주세요.
         */
        int num1 = 3 ,num2 = 2;
        System.out.println(solution(num1,num2));
    }
    static int solution(int num1, int num2) {
        double result = 0;

        result = (double)num1 / num2;
        result *= 1000;

        return (int)result;
    }
}
