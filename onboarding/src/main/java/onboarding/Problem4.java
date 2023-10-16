package onboarding;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        return answer;
    }

    static class Alphabet{
        private Map<Character,Character> map;
        private Alphabet(Map<Character,Character> map) {
            this.map =map;
            setAlphabets('a');
            setAlphabets('A');
        }

        public static Alphabet of(){
            Alphabet alphabet = new Alphabet(new HashMap<Character, Character>());
            return alphabet;
        }

        private void setAlphabets(char start){

            for (int i = start; i <=start+25 ; i++) {
                map.put((char)i, (char)(start*2+25-i));
            }
        }


    }



}
