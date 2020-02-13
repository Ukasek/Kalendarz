public class ConverterTest {
    public static void main(String[] args) {

        for (int i = 1; i <= CalendarConverter.getNumberOfDays(); i++) {
            System.out.println(i + " " + "dzień tygodna to " + CalendarConverter.convertDayToString(i));
        }
    }
}
