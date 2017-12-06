class Acronym {
    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String Acronym = "";
        String phraseArray[] = phrase.split("[^a-zA-Z]+");
        for (String word : phraseArray) {
            String tempArray[] = word.split("");
            Acronym = Acronym + tempArray[0].toUpperCase();

        }

        return Acronym;
    }

}
