package onboarding;

import java.util.stream.IntStream;

/*
배달이가 좋아하는 369게임을 하고자 한다.
놀이법은 1부터 숫자를 하나씩 대면서, 3, 6, 9가 들어가는 숫자는
숫자를 말하는 대신 3, 6, 9의 개수만큼 손뼉을 쳐야 한다.
숫자 number가 매개변수로 주어질 때, 1부터 number까지
손뼉을 몇 번 쳐야 하는지 횟수를 return 하도록 solution 메서드를 완성하라
*/
public class Problem3 {
    public static int solution(int number) {
        return new Problem3().getResult(number);
    }

    public  int getResult(int end){
        int count = 0;

        for (int i = 1; i <= end ; i++) {
            count += countNumberOf3or6or9(i);
        }
        return count;
    }

    private int countNumberOf3or6or9(int number){
        int count = 0;
        while(number!=0){
            count += is3or6or9(number%10);
            number /= 10;
        }
        return count;
    }

    private int is3or6or9(int number){
        if(number==3||number==6||number==9){
            return 1;
        };
        return 0;
    }



}





