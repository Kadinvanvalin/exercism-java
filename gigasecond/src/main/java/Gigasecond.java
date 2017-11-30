import java.time.*;

/**
 * @author kadinvanvalin
 * Calculate the moment when someone has lived for 10^9 seconds.
 */
class Gigasecond {
    private LocalDateTime birthday;
    private LocalDateTime gigasecondOld;
    private long gigasecond = 1_000_000_000;

    /**
     *
     * @param birthDate birthdate of the person you are checking
     */
    Gigasecond(LocalDate birthDate) {
        this.birthday =  LocalDateTime.of(birthDate, LocalTime.MIDNIGHT);
        this.gigasecondOld = birthday.plusSeconds(gigasecond);
    }


    /**
     *
     * @param birthDateTime birthdate of the person you are checking
     */
    Gigasecond(LocalDateTime birthDateTime) {
        this.birthday = birthDateTime;
        this.gigasecondOld = birthday.plusSeconds(gigasecond);

    }

    /**
     * 
     * @return the time when user is a gigasecond old
     */
    LocalDateTime getDate() {
        return gigasecondOld;
    }

}
