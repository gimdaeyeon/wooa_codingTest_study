package onboarding;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static String solution(String word) {
        Alphabet alphabet = Alphabet.of();
        return alphabet.getTreeFrogsAnswer(word);
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
        private boolean isAlphabet(char ch){
            return (ch>='a'&& 'z'>= ch)|| (ch>='A'&& 'Z'>= ch);
        }

        public String getTreeFrogsAnswer(String momsWords){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < momsWords.length() ; i++) {
                sb.append(convertingCharacter(momsWords.charAt(i)));
            }
            return sb.toString();
        }

        private char convertingCharacter(char ch){
            if(isAlphabet(ch)){
                return map.get(ch);
            }
            return ch;
        }


    }



}
