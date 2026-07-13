package kopo.programmers.level0;

public class OddArrayGenerator {
    public static void main(String[] args) {
        /*
         * 짝수가 싫어요
         *
         * 정수 n이 매개변수로 주어질 때
         * n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록
         * solution 함수를 완성해주세요.
         */
        int n = 0;
        System.out.println(solution(n));
    }

    static int[] solution(int n) {
        int a = 0;
//배열 갯수를 정해주지 않음 <- 이게 문제인데
        //new int[]를 사용하여 배열 수를 구하기
        int[] ans = new int[(n + 1) / 2];
// 숫자 입력시 홀수만 출력 if문 사용 -> i / 2 != 0 이거 써야함
//+=2를 넣으면 홀수만 출력 1 - 3, 4 - 6 이런식으로
        for (int i = 1; i <= n; i += 2) {
            ans[a] = i;
            a++;
        }
        //n값을 ans값으로 넣어야함
        return ans;
    }
}
