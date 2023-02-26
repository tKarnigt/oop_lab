import java.util.Scanner;
public class HelloWorld
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scn.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = scn.nextDouble();
        double bmi = (weight*0.45359237)/((height*0.0254)*(height*0.0254));
        System.out.print("BMI is "+bmi);
    }
}
