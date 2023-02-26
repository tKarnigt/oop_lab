import java.util.Scanner;
import java.util.Random;
public class lab2_1 {
    public static void checkDay(int day)
    {
        if (day%7 == 0) System.out.print("Sunday");
        else if (day%7 == 1) System.out.print("Monday");
        else if (day%7 == 2) System.out.print("Tuesday");
        else if (day%7 == 3) System.out.print("Wednesday");
        else if (day%7 == 4) System.out.print("Thursday");
        else if (day%7 == 5) System.out.print("Friday");
        else if (day%7 == 6) System.out.print("Saturday");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int dayToday = scn.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int dayFuture = scn.nextInt();
        System.out.print("Today is ");
        checkDay(dayToday);
        System.out.print(" and the future day is ");
        checkDay(dayToday+dayFuture);
    }
}
