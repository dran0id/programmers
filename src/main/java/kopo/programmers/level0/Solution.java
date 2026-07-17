package kopo.programmers.level0;

public class Solution {
    public static void main(String[] args) {
        /*
         * 짝수의 합
         *
         * 정수 n이 주어질 때
         * n이하의 짝수를 모두 더한 값을 return 하도록
         * solution 함수를 작성해주세요.
         */
        int n = 32874;
        System.out.println(solution(n));
    }
    static int solution(int n) {
        int hap = 0;
        for(int i=0;i<=n;i++){
            if(i % 2 == 0){
                hap += i;
            }
        }
        return hap;
    }
}
