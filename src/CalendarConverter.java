public class CalendarConverter {
    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;
    private static final int NUMBER_OF_DAYS = 7;

//

    public static int getNumberOfDays() {
        return NUMBER_OF_DAYS;
    }

    public static String convertDayToString(int dayNumber) {
        String weekDay = "Dzień tygodnia ";
        switch (dayNumber) {
            case MONDAY:
                weekDay = "Poniedziałek";
                break;
            case TUESDAY:
                weekDay = "Wtorek";
                break;
            case WEDNESDAY:
                weekDay = "Sroda";
                break;
            case THURSDAY:
                weekDay = "Czwartek";
                break;
            case FRIDAY:
                weekDay = "Piątek";
                break;
            case SATURDAY:
                weekDay = "Sobota";
                break;
            case SUNDAY:
                weekDay = "Niedziela";
                break;
        }
        return weekDay;

    }
}
