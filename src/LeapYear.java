public class LeapYear {

    private static boolean calculated;

    public static boolean isLeapYear ( int year) {
        int year1 = year % 4;
        int year2 = year % 100;
        int year3 = year % 400;

        if(year <=1 || year > 9999) {
            System.out.println("false");
            return false;
        } else if (year1 == 0 && year2 != 0) {
            System.out.println("true");
            return true;
        } else if (year3 == 0) {
            System.out.println("return true");
            return true;
        } else {
            System.out.println(" false ");
            return false;
        }
    }

    public static void main(String[] args) {
        isLeapYear(1800);
        System.out.println(calculated);
        System.out.println(1600 % 4);
    }
}


