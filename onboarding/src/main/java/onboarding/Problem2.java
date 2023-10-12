package onboarding;

/*
* 암호문을 좋아하는 괴짜 개발자 브라운이 이번에는 중복 문자를 이용한 새로운 암호를 만들었다. 예를 들어 "browoanoommnaon"이라는 암호문은 다음과 같은 순서로 해독할 수 있다.
* "browoanoommnaon"
* "browoannaon"
* "browoaaon"
* "browoon"
* "brown"
* 임의의 문자열 cryptogram이 매개변수로 주어질 때, 연속하는 중복 문자들을 삭제한 결과를 return 하도록 solution 메서드를 완성하라.
* */
public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = cryptogram;
        boolean isChange = true;
        boolean isDuplicate = false;
        StringBuilder sb = new StringBuilder();

        while(isChange){
            isChange = false;
            isDuplicate = false;
            for (int i = 0; i < answer.length()-1; i++) {
                System.out.println(i+": "+ answer);
                if(isDuplicate){
                    isDuplicate = false;
                    continue;
                }
                char c = answer.charAt(i);

                if(c == answer.charAt(i+1)){
                    isChange = true;
                    isDuplicate = true;
                    continue;
                }
                sb.append(c);
                if(i==answer.length()-1){
                    sb.append(answer.charAt(i+1));
                }
                System.out.println(sb.toString());
            }
            answer = sb.toString();
            sb.setLength(0);
        }

        return answer;
    }
}
