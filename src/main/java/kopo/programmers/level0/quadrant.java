package kopo.programmers.level0;

public class quadrant {
    public static void main(String[] args) {
        /**
         * 점의 위ㅣ치 구하기
         *
         * 사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다.
         * 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
         * x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
         * x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
         * x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
         * x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
         * x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
         * 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록
         * solution 함수를 완성해주세요.
         */
        int[] dot = {245,-854};
        System.out.println(solution(dot));
    }
    static int solution(int[] dot) {
        int aws = 0;
        if(dot[0] > 0 && dot[1] > 0){//둘다짝수면
            aws += 1;
        }else if(dot[0] < 0 && 0 > dot[1]){//둘다 홀수
            aws += 3;
        }else if(dot[0] < 0 && 0 < dot[1]){//0번째가 홀수
            aws += 2;
        }else if (dot[0] > 0 && 0 > dot[1]){//0번째가 짝수
            aws += 4;
        }
        return aws;
        //return Math.abs((dot[0] > 0 ? 1 : 2) + (dot[1] > 0 ? 0 : -5));
    }

}
