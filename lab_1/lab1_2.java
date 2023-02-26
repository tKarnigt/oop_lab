import java.util.Scanner;
public class lab1_2
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Cramer’s rule to solve the g 2 * 2 of linear equation");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.print("Input a = ");
        double a = scn.nextDouble();
        System.out.print("Input b = ");
        double b = scn.nextDouble();
        System.out.print("Input e = ");
        double e = scn.nextDouble();
        System.out.print("Input c = ");
        double c = scn.nextDouble();
        System.out.print("Input d = ");
        double d = scn.nextDouble();
        System.out.print("Input f = ");
        double f = scn.nextDouble();
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("x = "+ x);
        System.out.print("y = "+ y);
    }
}
