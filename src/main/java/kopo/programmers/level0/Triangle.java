package kopo.programmers.level0;

public class Triangle {
    public static void main(String[] args) {
        /*
         * 삼각형의 완성조건 1
         *
         * 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
         *
         * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
         * 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
         * 세 변으로 삼각형을 만들 수 있다면 1
         * 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
         */
        int[] sides = {199, 72, 222};
        System.out.println(solution(sides));
    }
    static int solution(int[] sides) {
        int ans = 0;
        int hap = 0;
        int max = 0;
        /**그니깐 1=된다 2=안된다
         1.제일 큰쪽을 구한다.
         2.그보다 작은 값의 합을 구함
         3.제일 큰 숫자와 합 값을 비교후 같거나
         합값이 더 작다면 2
         합값이 더 크다면 1
         */
        for(int i = 0; i < sides.length; i++){//큰값구하기
            if(max < sides[i]){
                max = sides[i];
                ans = i;
            }
        }
        sides[ans] = 0;//max값 위치를 0으로 만들기
        for(int j = 0; j<sides.length; j++){//합 값 구하기
            hap += sides[j];//배열 다 더하기
        }
        if(max < hap){//맥스값과 합 값 크기 비교
            return 1;
        }else{
            return 2;
        }
    }
}
