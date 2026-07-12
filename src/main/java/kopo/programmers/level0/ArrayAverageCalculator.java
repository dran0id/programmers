package kopo.programmers.level0;

public class ArrayAverageCalculator {
    public static void main(String[] args) {
        /**
         * 배열의 평균값
         *
         * 정수 배열 numbers가 매개변수로 주어집니다.
         * numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
         */
        int[] num = {};
        System.out.println(solution(num));
    }
    static double solution(int[] num) {
        // 평균값 구하기 => 모든 숫자를 다 더하고 더한 숫자 갯수 만큼 나누면 됨
        double ans = 0;
        int aaa = 0;
        //aaa값은 배열 갯수에 따라 크기?가 정해지고
        for (int i = 0 ; i < num.length; i++){
            ans += num[i];
        }
        ans = ans / num.length;
        return ans;
    }
}
