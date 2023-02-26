import java.util.Scanner;
import java.util.Random;
public class lab2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt();
        for(int i = 1 ; i <= num ; i++)
        {
            for(int j = num ; j>= 1 ; j--)
            {
                if(j <= i) System.out.print(j+" ");
                else if(j<10) System.out.print(" ");
                else System.out.print(" ");
            }
            for(int k = 2 ; k<= num ; k++)
            {
                if(k <= i) System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
64010022 กฤษฎิ์ ตั้งภิญโญพุฒิคุณ
