import java.util.Scanner;
import java.util.Random;
public class lab2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the first city: ");
        String firstCity = sc.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = sc.nextLine();
        System.out.print("Enter the third city: ");
        String thirdCity = sc.nextLine();
        if(firstCity.compareTo(secondCity)<0 && firstCity.compareTo(thirdCity)<0)
        {
            if(secondCity.compareTo(thirdCity)<0) System.out.print("The three cities in alphabetical order are "+firstCity+" "+secondCity+" "+thirdCity);
            else System.out.print("The three cities in alphabetical order are "+firstCity+" "+thirdCity+" "+secondCity);
        }
        else if(secondCity.compareTo(firstCity)<0 && secondCity.compareTo(thirdCity)<0)
        {
            if(firstCity.compareTo(thirdCity)<0) System.out.print("The three cities in alphabetical order are "+secondCity+" "+firstCity+" "+thirdCity);
            else System.out.print("The three cities in alphabetical order are "+secondCity+" "+thirdCity+" "+firstCity);
        }
        else
        {
            if(firstCity.compareTo(secondCity)<0) System.out.print("The three cities in alphabetical order are "+thirdCity+" "+firstCity+" "+secondCity);
            else System.out.print("The three cities in alphabetical order are "+thirdCity+" "+secondCity+" "+firstCity);
        }
    }
}
