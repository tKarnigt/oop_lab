import java.util.Scanner;
public class lab1_1
{
    public static void main(String[] args)
    {
        int pplt = 312032486;
        int birth = 0;
        int death = 0;
        int immi = 0;
        for (int i = 1 ; i <= 5 ; i++)
        {
            birth = (365 * i * 24 * 60 * 60) / 7;
            death = (365 * i * 24 * 60 * 60) / 13;
            immi = (365 * i * 24 * 60 * 60) / 45;
            System.out.println("Population in year " + i + " is " + (pplt +
                    birth - death + immi));
        }
    }
}
