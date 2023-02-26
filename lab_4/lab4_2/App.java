import java.util.GregorianCalendar;
import java.util.Calendar;
public class App
{
    public static void main(String[] args)
    {
        GregorianCalendar g = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is "+g.get(GregorianCalendar.YEAR));
        System.out.println("Month is "+g.get(GregorianCalendar.MONTH));
        System.out.println("Date is "+g.get(GregorianCalendar.DATE));
        System.out.println("Day of week is "+g.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------");
        g.add(Calendar.DATE, 1);
        System.out.print("After specified the elapsed time of one day after current day \n" + "Year is "+g.get(GregorianCalendar.YEAR) + "\nMonth is "+g.get(GregorianCalendar.MONTH) + "\nDate is "+g.get(GregorianCalendar.DATE) + "\nDay of week is"+g.get(GregorianCalendar.DAY_OF_WEEK)+"\n");
        System.out.println(g.getTime());
    }
}
