public class Main {
    public static void main(String[] args) {
        // Checks if -1600 is a leap year.
        System.out.println(isLeapYear(-1600));

        // Checks if 1600 is a leap year.
        System.out.println(isLeapYear(1600));

        // Checks if 2017 is a leap year.
        System.out.println(isLeapYear(2017));

        // Checks if 2000 is a leap year.
        System.out.println(isLeapYear(2000));
    }

    /**
     * Checks if the year is a leap year.
     *
     * @param year Should be between 1 and 9999.
     * @return true, if the year is a leap year, otherwise false.
     */
    public static boolean isLeapYear(int year) {
        // Checks for valid input.
        if (year < 1 || year > 9999) {
            // Not in range.
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return (year % 400 == 0);
            } else {
                // Year is a leap year.
                return true;
            }
        } else {
            // Not a leap year.
            return false;
        }
    }
}