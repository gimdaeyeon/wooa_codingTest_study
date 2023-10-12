package onboarding;

import com.sun.net.httpserver.HttpServer;
import exceptions.ImpossiblePageException;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

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
    public static final int EXCEPTION_CASE = -1;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int pobiResult;
        int crongResult;
        try {
            pobiResult = new Pages(pobi).getScore();
            crongResult = new Pages(crong).getScore();
        } catch (ImpossiblePageException e) {
            return EXCEPTION_CASE;
        }

        if(isPobiWin(pobiResult,crongResult)){
            return POBI_WIN_CASE;
        }
        if(isCrongWin(pobiResult,crongResult)){
            return CRONG_WIN_CASE;
        }
        return TIE_CASE;
    }

    static boolean isPobiWin(int pobi, int crong){
        return pobi>crong;
    }
    static boolean isCrongWin(int pobi, int crong){
        return pobi<crong;
    }




    static class Pages{
        private final int PAGE_LENGTH = 2;
        private final int LEFT_PAGE;
        private final int RIGHT_PAGE;


        private final List<Integer> list;

        public Pages(List<Integer> list) throws ImpossiblePageException {
            this.list =list;
            LEFT_PAGE = list.get(0);
            RIGHT_PAGE = list.get(1);

            if(LEFT_PAGE-RIGHT_PAGE != -1){
                throw new ImpossiblePageException("나올 수 없는 페이지 번호들입니다");
            }
        }

        //        최종적으로 밖으로 보여질 메소드 입력받은 리스트
        public int getScore(){
            return Math.max(getBiggerValue(LEFT_PAGE),getBiggerValue(RIGHT_PAGE));
        }

//
        private int getBiggerValue(int number){
            List<Integer> digits = getExtractDigits(number);
            return Math.max(getPlusValue(digits),getMultipliedValue(digits));
        }

//        입력받은 숫자를 각 자리수로 분리한 리스트르 반환하는 메소드
        private List<Integer> getExtractDigits(int number){
            List<Integer> digits = new ArrayList<>();
            while(number !=0){
                int digit = number%10;
                digits.add(digit);
                number /=10;
            }
            return digits;
        }

//        분리된 숫자들을 모두 더하거나 곱하고 큰 수를 반환

//        각 자릿 수를 모두 더한 값
        private int getPlusValue(List<Integer> digits){
            return digits.stream()
                    .mapToInt(i->i)
                    .sum();
        }
//        각 자릿 수를 모두 곱한 값
        private int getMultipliedValue(List<Integer> digits){
            return digits.stream()
                         .reduce(1,(i,j)->i*j);
        }

    }






}
