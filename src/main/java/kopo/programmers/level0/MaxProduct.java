package kopo.programmers.level0;

public class MaxProduct {
    public static void main(String[] args) {
        /**
         * 최대값 만들기 1
         *
         * 정수 배열 numbers가 매개변수로 주어집니다.
         * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록
         * solution 함수를 완성해주세요.
         */
        int[] num = {327,26,73,78,12,11};
        System.out.println(solution(num));
    }
    static int solution(int[] num) {
        int ans = 0;
        int wer = 0;
        for (int i = 0; i < num.length; i++){//하나씩 꺼내서 비교 후 변수 안에 넣기
            if (ans < num[i]){
                ans = num[i];
                wer = i;
            }
        }
        num[wer] = -1;
        wer = 0;
        for (int i = 0; i < num.length; i++){//하나씩 꺼내서 비교 후 변수 안에 넣기
            if (wer < num[i]){
                wer = num[i];
            }
        }
        return ans * wer;
    }
}
