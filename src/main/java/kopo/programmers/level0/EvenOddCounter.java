package kopo.programmers.level0;

public class EvenOddCounter {
    public static void main(String[] args) {
        /*
         * 짝수 홀수 갯수
         *
         * 정수가 담긴 리스트 num_list가 주어질 때
         * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록
         * solution 함수를 완성해보세요.
         */
        int[] num= {1,2,3,4,5,6,7,8,9};
        System.out.println(solution(num));
    }
    static int[] solution(int[] num) {
        //if문 사용해서 짝수 갯수보고 배열 짝수를 0번째에
        //
        int[] ans = {0,0};
        int index;
        for(int i = 0; i < num.length;i++){
            index = 0;
            if(num[i] % 2 == 0){
                //짝수
                ans[0] += 1;
            }else{
                //홀수
                ans[1] += 1;
            }
        }
        return ans;
    }
}
