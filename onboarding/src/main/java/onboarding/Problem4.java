package onboarding;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static String solution(String word) {
        FrogDictionary frogDictionary = FrogDictionary.of();
        return frogDictionary.reverseAlphabets(word);
    }

    static class FrogDictionary{
        private Map<Character,Character> map;
        private static final int ALPHABET_LENGTH =25;
        private FrogDictionary(Map<Character,Character> map) {
            this.map =map;
            setAlphabets('a');
            setAlphabets('A');
        }

        public static FrogDictionary of(){
            FrogDictionary alphabet = new FrogDictionary(new HashMap<Character, Character>());
            return alphabet;
        }

        private void setAlphabets(char start){

            for (int i = start; i <=start+ALPHABET_LENGTH ; i++) {
                map.put((char)i, (char)(start*2+ALPHABET_LENGTH-i));
            }
        }
        public boolean isAlphabet(char ch){
            return (ch>='a'&& 'z'>= ch)|| (ch>='A'&& 'Z'>= ch);
        }

        public String reverseAlphabets(String momsWords){
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
