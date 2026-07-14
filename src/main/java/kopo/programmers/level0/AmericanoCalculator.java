package kopo.programmers.level0;

public class AmericanoCalculator {
    public static void main(String[] args) {
        /*
         * 아이스 아메리카노
         * 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
         * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
         * 머쓱이가 최대로 마실 수 있는아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록
         * solution 함수를 완성해보세요.
         */
        int money = 13600;
        System.out.println(solution(money));
    }
    static int[] solution(int money) {
        int[] ans = {0,0}; //배열 2개를 가짐 ㅇㅇ
        // money = ??
        //일단 돈이 매게 변수고 첫번째 아아를 몇번 살수 있는지 -> / 몇번 나눠지는지를 봐야겠지?
        //뒤는 나눈 후 % 몫으로 가야함 ㅇㅇ
        ans[0] = money / 5500;
        ans[1] = money % 5500;
        return ans;
    }
}
