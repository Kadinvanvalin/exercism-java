class SpaceAge {
    private double secondsOld;

    private static final double EARTH_ORBITAL = 31557600;
    SpaceAge(double secondsOld) {
        this.secondsOld = secondsOld;
    }

    private double findAge(double orbit){
        return secondsOld / (EARTH_ORBITAL * orbit);
    }


    double getSecondsOld() {
        return secondsOld;
    }

    double onEarth() {
        return findAge(1);
    }

    double onMercury() {
        return findAge(0.2408467);
    }

    double onVenus() {
        return findAge(0.61519726);
    }

    double onMars() {
        return findAge(1.8808158);
    }

    double onJupiter() {
        return findAge(11.862615);
    }

    double onSaturn() {
        return findAge(29.447498);
    }

    double onUranus() {
        return findAge(84.016846 );
    }

    double onNeptune() {
        return findAge(164.79132);
    }

}
