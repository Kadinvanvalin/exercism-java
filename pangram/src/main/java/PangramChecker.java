import java.util.*;

public class PangramChecker {

    public boolean isPangram(String input) {
        String[] alphabet;
        alphabet = new String[]{ "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] inputArray = input.split("");

        HashMap<String, Integer> alphabetCount = new HashMap<String, Integer>();

        if(input == "") {
            return false;
        }
        for (String letter: inputArray) {
            if(!alphabetCount.containsKey(letter)){
            alphabetCount.put(letter.toUpperCase(), 1);
            }
        }

        for (String letter: alphabet) {
            if(!alphabetCount.containsKey(letter)){ return false; }
        }
        return true;
    }

}
