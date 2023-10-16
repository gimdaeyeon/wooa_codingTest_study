package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        Cashs cashs = Cashs.of(money);
        return cashs.withDrawCash();
    }
}

class Cashs{
    private List<Integer> list;

    private Cashs(List<Integer> list, int money) {
        this.list = list;
        toBanknote(money);
    }
    public static Cashs of(int money){
        Cashs cashs = new Cashs(new ArrayList<Integer>(BANKNOTES.values().length), money);
        return cashs;
    }

    public List<Integer> withDrawCash(){
        return list;
    }

    /*
    * 이 메소드 안에서 각 현금별로 for 문을 돌린다.
    * 각 현금의 값으로 while문을 돌려 해당 지폐가 몇개 필요한지 구해서 list에 추가하고,
    * 해당 지폐로 변환하고 남은 돈을 반환한다
    * */
    public void toBanknote(int money){
        for(BANKNOTES banknote: BANKNOTES.values()){

        }
    }




}



enum BANKNOTES{
    BANKNOTE50000(0,50000), BANKNOTE10000(1,10000),
    BANKNOTE5000(2,5000), BANKNOTE1000(3,1000),
    BANKNOTE500(4,500), BANKNOTE100(5,100),
    BANKNOTE50(6,50), BANKNOTE10(7,10), BANKNOTE1(8,1);
    private int index;
    private int value;

    BANKNOTES(int index, int value) {
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

