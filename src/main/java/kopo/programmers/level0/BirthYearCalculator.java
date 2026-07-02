package kopo.programmers.level0;

public class BirthYearCalculator {
    public static void main(String[] args) {
        /**
         * 나이 구하기
         * 머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
         * 2022년 기준 선생님의 나이 age가 주어질 때
         * \선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요
         */

        int age = 40;
        System.out.println(solution(age));
    }
    static int solution(int age) {
        int hap;
        hap = 2023 - age;

        return hap;
    }
}
