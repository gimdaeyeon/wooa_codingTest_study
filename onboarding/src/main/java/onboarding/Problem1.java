package onboarding;

import com.sun.net.httpserver.HttpServer;

import java.util.ArrayList;
import java.util.List;

/*
* 1. 책을 임의로 펼친다.
* 2. 왼쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
*  2-1. 각 페이지 번호의 자리 숫자들을 구한다.
*  2-2. 각 자리 숫자를 모두 더한 값과 모두 곱한 값을 비교한다
* 3. 오른쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
* 4. 2~3 과정에서 가장 큰 수를 본인의 점수로 한다.
* 5. 점수를 비교해 가장 높은 사람이 게임의 승자가 된다.
* 6. 시작 면이나 마지막 면이 나오도록 책을 펼치지 않는다.
* 실행결과 예시 : [97, 98]	[197, 198]	0
*/

class Problem1 {
    public static final int POBI_WIN_CASE =1;
    public static final int CRONG_WIN_CASE =2;
    public static final int TIE_CASE = 0;
    public static final int EXCEPTION_CASE = 0;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        Pages pobiPages = new Pages(pobi);
        Pages crongPages = new Pages(crong);

        return answer;
    }

    static class Pages{
        private final int PAGE_LENGTH = 2;
        private final int LEFT_PAGE;
        private final int RIGHT_PAGE;


        private final List<Integer> list;

        public Pages(List<Integer> list){
            this.list =list;
            this.LEFT_PAGE = list.get(0);
            this.RIGHT_PAGE = list.get(1);
        }

//        최종적으로 밖으로 보여질 메소드 입력받은 리스트
        public int getBiggerValue(List<Integer> list){

            return 0;
        }

        public static List<Integer> getExtractDigits(int number){
            List<Integer> digits = new ArrayList<>();
            while(number !=0){
                int digit = number%10;
                digits.add(digit);
                number /=10;
            }
            return digits;
        }




    }






}
