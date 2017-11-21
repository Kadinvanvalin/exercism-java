public class Hamming {

    String leftStrand;
    String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        String[] leftArray = leftStrand.split("");
        String[] rightArray = rightStrand.split("");

        int distance = leftArray.length;
        for (int i = 0; i < leftArray.length; i++) {
            if (leftArray[i].equals(rightArray[i])) {
                distance = distance - 1;
            }
        }

        return distance;
    }

}
