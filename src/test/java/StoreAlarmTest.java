import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreAlarmTest {

    @Test
    // Alarm bei zu vielen Personen
    public void tooManyPPL () {
        assertEquals("Zu viele Personen", StoreAlarm.alarm(31, "gelb"));
        assertEquals("Zu viele Personen", StoreAlarm.alarm(1, "rot"));
        assertEquals("Zu viele Personen", StoreAlarm.alarm(61, "grün"));
    }

    @Test
    // Alarm bei weniger bzw. erlaubten Personen
    public void notEnoughPPL () {
        assertEquals("Maximale Personenzahl nicht überschritten", StoreAlarm.alarm(30, "gelb"));
        assertEquals("Maximale Personenzahl nicht überschritten", StoreAlarm.alarm(45, "grün"));
    }

}