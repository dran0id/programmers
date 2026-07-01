package kopo.programmers.level0;

public class NumberComparator {
    public static void main(String[] args) {
    /*
    숫자 비교하기

    정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1
    다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
     */
        int num1 = 2 ,num2 = 3;
        System.out.println(solution(num1,num2));
    }
    static int solution(int num1, int num2) {
        int result = 0;
        if (num1 == num2){
            result = 1;
        } else if (num1 != num2){
            result = -1;
        }
        return result;
    }
}
