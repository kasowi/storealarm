public class StoreAlarm {



    public static String alarm(int a, String alertLevel) {
        if (a > 30 && alertLevel.equals("gelb")) {
            return "Zu viele Personen";
        }
        if (a > 0 && alertLevel.equals("rot")) {
            return "Zu viele Personen";
        }
        if (a > 60 && alertLevel.equals("grün")){
            return "Zu viele Personen";
        }

        else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }
}
