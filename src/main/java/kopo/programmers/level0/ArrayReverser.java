package kopo.programmers.level0;

public class ArrayReverser {
    public static void main(String[] args){
        /*
         * 배열 뒤집기
         *
         *정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
         * num_list의 원소의 순서를 거꾸로 뒤집은 배열을
         * return하도록 solution 함수를 완성해주세요.
         */
        int[] num= {1,2,3,4,5,6};
        System.out.println(solution(num));
    }
        static int[] solution(int[] num) {
            //그니깐 아래 ans에 역순으로 배열을 넣은후 그 배열을 num 배열에 넣는다? 이 말이네?
            int index = 0;
            //인덱스 만든다
            int[] ans = new int[num.length];
            for (int i = num.length -1; i >= 0; i--){
                //i = num.length -1; i >= 0; 이게 역순으로(-1 역순으로 바꿈) num를 ans배열로 넣는다
                ans[index]= num[i];
                //indxe++ 하나하나 추가 한다는 뜻 위에서 크기는 정해졌지만 한 번호에 다 때려 박아서 @,0,0,0,0,0이 될수 있기 때문에 인덱스 ++을 넣는다.
                index++;
            }
            return ans;
    }
}
