package kopo.programmers.level0;

public class DivisionQuo {
    public static void main(String[] args) {
        /*
          몫 구하기

          정수 num1, num2가 매개변수로 주어질 때,
          num1을 num2로 나눈 몫을 return 하도록
          solution 함수를 완성해주세요.
         */
        int num1 = 0,num2=0;
        System.out.println(solution(num1,num2));
    }
    static int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 / num2;
        return answer;
    }
}
