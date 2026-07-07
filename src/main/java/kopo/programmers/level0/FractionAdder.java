package kopo.programmers.level0;

public class FractionAdder {
    public static void main(String[] args) {
        /**
         * 분수의 덧셈
         *
         * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
         * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
         * 두 분수를 더한 값을 기약 분수로 나타냈을 때
         * 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
         */
        int numer1 = 1, numer2 = 3, denom1 = 2, denom2 = 4;
        System.out.println(solution(numer1, numer2, denom1, denom2));
    }

    static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 1};
        int hapden1, hapden2, hapnum1, hapnum2, hapn1;
        hapden1 = denom1 * denom2;//분모끼리 곱한거
        //hapden1은 분모의 곱
        hapnum1 = denom2 * numer1;
        hapnum2 = denom1 * numer2;
        //상대 분모 곱을 분자랑 곱함
        //(hapnum1/hapden),(hapnum2/hapden)
        hapn1 = hapnum1 + hapnum2;
        //분수 끼리 서로 더하는거 끝 이제 기약 분수
        int min;
        if (hapn1 < hapden1) {
            min = hapn1;
        } else {
            min = hapden1;
        }
        for (int i = min; i >= 1; i--) {
            if (hapn1 % i == 0) {
                if (hapden1 % i == 0) {
                    hapn1 = hapn1 / i;
                    hapden1 = hapden1 / i;
                }
            }
        }
        answer[0] = hapn1;
        answer[1] = hapden1;
        return answer;
    }
}
