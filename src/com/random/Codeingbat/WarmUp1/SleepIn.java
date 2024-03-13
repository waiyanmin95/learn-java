package random.Codeingbat.WarmUp1;

public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if ( !weekday || vacation ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }
}
