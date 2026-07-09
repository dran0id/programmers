package kopo.programmers.level0;

public class PizzaOrderCalculator {
    public static void main(String[] args) {
        /**
         * 피자 나눠먹기
         *
         * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
         * 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
         * n명의 사람이 최소 한 조각 이상 피자를 먹으려면
         * 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
         */
        int n=10,slice=7;
        System.out.println(solution(n,slice));
    }
    static int solution(int slice, int n) {
        //n이 사람 slice가 피자조각는 2~10조각까지 원하는 수로 잘라줌
        //slice랑 n이랑 비교후 n이 더 크면 hap(피자)을 추가
        //피자 조각이랑 피자랑은 다름(중요)
        int slin = 0;
        if(n == slice){
            slin = 1;
        }
        else if(n % slice == 0){
            slin = n / slice;
        }
        else if(n % slice != 0){
            slin = n / slice;
            slin = slin + 1;
        }
        return slin;
    }
}
