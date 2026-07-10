package kopo.programmers.level0;

public class ArrayDoubler {
    public static void main(String[] args) {
        /**
         *배열 두배 만들기
         *
         * 정수 배열 numbers가 매개변수로 주어집니다.
         * numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록
         * solution 함수를 완성해주세요.
         */
        int[] num = {};
        System.out.println(solution(num));
    }
    static int[] solution(int[] num) {
        for(int i = 0; i < num.length; i++){
            num[i]= num[i] * 2;
        }
        return num;
    }
}
