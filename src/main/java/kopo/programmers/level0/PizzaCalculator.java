package kopo.programmers.level0;

public class PizzaCalculator {
    public static void main(String[] args) {
        /**
         * 피자 나눠먹기
         * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
         * 피자를 나눠먹을 사람의 수 n이 주어질 때
         * 모든 사람이 피자를 한 조각 이상 먹기 위해
         * 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
         */
        int n = 15;
        System.out.println(solution(n));
    }
    static int solution(int n) {
        int piza = 0;
        int hap = 0;
        if(n <= 7){
            hap = 1;
        }else if(n % 7 == 0){
            hap = n / 7;
        }else if(n / 7 != 0){
            piza = n / 7;
            hap = piza + 1;
        }
        return hap;
    }
}
