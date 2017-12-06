import java.util.Map;
import java.util.HashMap;

class Scrabble {
    private String word;
    private Letter[] completeWord;

    Scrabble(String word) {
        this.word = word;
        this.completeWord = makeWord(word);
    }

    int getScore() {
        int runningTotal = 0;
        if (completeWord.length == 0) return 0;

        for (Letter tile : completeWord) {
            runningTotal += tile.score();
        }
        return runningTotal;
    }

    private Letter[] makeWord(String word) {
        if (word.length() == 0) {
            return new Letter[0];
        }

        Letter[] tempWord = new Letter[word.length()];
        int i = 0;
        for (String tile : word.split("")) {
            tempWord[i] = new Letter(tile);
            i++;
        }
        return tempWord;
    }

//    int x = Score.A.getValue();
//
//
//    private enum Score {
//        A(1),
//        B(20),
//        C(2);
//
//        private int value;
//
//        Score(int value) {
//            this.value = value;
//        }
//
//        int getValue() {
//            return value;
//        }
//    }

    private class Letter {
        private String letter;
        private int value;

        private final Map<String, Integer> MY_MAP = new HashMap<String, Integer>() {
            {
                put("A", 1);
                put("E", 1);
                put("I", 1);
                put("O", 1);
                put("U", 1);
                put("L", 1);
                put("N", 1);
                put("R", 1);
                put("S", 1);
                put("T", 1);

                put("D", 2);
                put("G", 2);

                put("B", 3);
                put("C", 3);
                put("M", 3);
                put("P", 3);

                put("F", 4);
                put("H", 4);
                put("V", 4);
                put("W", 4);
                put("Y", 4);


                put("K", 5);

                put("J", 8);
                put("X", 8);

                put("Q", 10);
                put("Z", 10);
            }
        };

        Letter(String letter) {
            this.letter = letter.toUpperCase();
            this.value = getValue(this.letter);
        }

        public int score() {
            return value;
        }

        private int getValue(String letter) {
            return MY_MAP.get(letter);
        }
    }

}


