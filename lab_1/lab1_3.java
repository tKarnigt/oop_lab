import java.util.Scanner;
public class lab1_3
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number between 0 to 1000: ");
        int num = scn.nextInt();
        if(num >= 0 && num <= 1000)
        {
            int ans = num/1000+((num/100)%10)+((num/10)%10)+(num%10);
            System.out.print(""+ans);
        }
        else System.out.print("This number is out of range!");
    }
}
