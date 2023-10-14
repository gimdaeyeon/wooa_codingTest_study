package onboarding;

import java.time.temporal.ChronoField;
import java.util.Stack;

/*
* 암호문을 좋아하는 괴짜 개발자 브라운이 이번에는 중복 문자를 이용한 새로운 암호를 만들었다. 예를 들어 "browoanoommnaon"이라는 암호문은 다음과 같은 순서로 해독할 수 있다.
* "browoanoommnaon"
* "browoannaon"
* "browoaaon"
* "browoon"
* "brown"
* 임의의 문자열 cryptogram이 매개변수로 주어질 때, 연속하는 중복 문자들을 삭제한 결과를 return 하도록 solution 메서드를 완성하라.
*
* 1. 입력받은 문자열을 Character배열로 만든다.
* 2. stack이 비어있으면 배열의 다음 값을 stack에 추가한다.
* 3. 비어있지 않으면 stack의 마지막 값과 들어온 문자를 비교한다
* 4. 두 문자가 같다면 해당 stack을 한 번 pop
* 5. 2,3,4 반복
* */
public class Problem2 {

    public static Stack<Character> charStack = new Stack<>();

    public static String solution(String cryptogram) {

        processCharArray(cryptogram.toCharArray());

        return "";
    }

    public static void processCharArray(char[] charArr){

        for(char ch: charArr){
            stackingCharInStack(ch);
        }

    }

    public static void stackingCharInStack(char ch){

    }



    /*처음 시도해본 방법
     * 결과 자체는 나왔지만 코드 분리하기가 힘들고 클린코드원칙에 맞지 않는 부분이 매우 많다.*/
//    public static final StringBuilder sb = new StringBuilder();
//
//    public static String solution(String cryptogram) {
//        boolean isChange = true;
//        return getAnswer(cryptogram, isChange);
//    }
//
//    public static String getAnswer(String code, boolean isChange){
//        while(isChange){
//            isChange = false;
//            for (int i = 0; i < code.length(); i++) {
//                if(i == 0){
//                    sb.append(code.charAt(i));
//                    continue;
//                }
//                char c = code.charAt(i);
//                int sbLeng = sb.length();
//
//                if(c == sb.charAt(sbLeng-1)){
//                    sb.delete(sbLeng-1,sbLeng);
//                    isChange = true;
//                    continue;
//                }
//                sb.append(c);
//            }
//            code = sb.toString();
//            sb.setLength(0);
//        }
//        return code;
//    }

}













