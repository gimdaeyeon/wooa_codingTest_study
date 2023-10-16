package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        return answer;
    }
}

enum Cashs{
    CASH50000(0,50000), CASH10000(1,10000),
    CASH5000(2,5000), CASH1000(3,1000),
    CASH500(4,500), CASH100(5,100),
    CASH50(6,50), CASH10(7,10), CASH1(8,1);
    private int index;
    private int value;

    Cashs(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }
}

