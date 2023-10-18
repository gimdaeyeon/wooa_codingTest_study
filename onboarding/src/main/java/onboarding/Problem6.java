package onboarding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem6 {
    public static final int EMAIL_INDEX = 0;
    public static final int NICKNAME_INDEX = 1;

    public static List<String> solution(List<List<String>> forms) {

        return findDuplicateNicknames(forms).stream().distinct().sorted().collect(Collectors.toList());
    }

    public static List<String> findDuplicateNicknames(List<List<String>> forms) {
        List<String> emailList = new ArrayList<>();

        for (int i = 0; i < forms.size(); i++) {
            for (int j = 0; j < forms.get(i).get(NICKNAME_INDEX).length() - 2; j++) {
                String str = forms.get(i).get(NICKNAME_INDEX).substring(j, j + 2);
                for (int k = 0; k < forms.size(); k++) {
                    if (k == i) {
                        continue;
                    }
                    if (forms.get(k).get(NICKNAME_INDEX).contains(str)) {
                        emailList.add(forms.get(k).get(EMAIL_INDEX));
                    }

                }

            }
        }

        return emailList;
    }


}
