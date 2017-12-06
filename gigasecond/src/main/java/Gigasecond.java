import java.time.*;

/**
 * @author kadinvanvalin
 * Calculate the moment when someone has lived for 10^9 seconds.
 */
class Gigasecond {
    private LocalDateTime birthday;
    private static final long GIGA_SECOND = 1_000_000_000;

    /**
     *
     * @param birthDate birthdate of the person you are checking
     */
    Gigasecond(LocalDate birthDate) {
        this.birthday =  LocalDateTime.of(birthDate, LocalTime.MIDNIGHT);
    }


    /**
     *
     * @param birthDateTime birthdate of the person you are checking
     */
    Gigasecond(LocalDateTime birthDateTime) {
        this.birthday = birthDateTime;
    }

    /**
     * 
     * @return the time when user is a gigasecond old
     */
    LocalDateTime getDate() {
        return birthday.plusSeconds(GIGA_SECOND);
    }

}
