import java.util.Arrays;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        String[] dnaArray = dnaStrand.split("");
        StringBuilder stringThing = new StringBuilder();
        for (int i = 0; i < dnaArray.length; i++) {
            if (dnaArray[i].equals("C")) {
                stringThing.append("G");
            } else if (dnaArray[i].equals("G")) {
                stringThing.append("C");
            } else if (dnaArray[i].equals("T")) {
                stringThing.append("A");
            } else if (dnaArray[i].equals("A")) {
                stringThing.append("U");
            } else {
                throw new java.lang.IllegalArgumentException("Invalid input");
            }
        }
        return stringThing.toString();
    }

}
