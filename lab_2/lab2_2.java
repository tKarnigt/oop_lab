import java.util.Scanner;
import java.util.Random;
public class lab2_2 {
    public static void srpGame(int x)
    {
        if(x == 0) System.out.print("scissor.");
        else if(x == 1) System.out.print("rock.");
        else System.out.print("paper.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int com = rand.nextInt(3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int you = sc.nextInt();
        System.out.print("The computer is ");
        srpGame(com);
        System.out.print(" You are ");
        srpGame(you);
        if(com == you) System.out.print(" It is a draw");
        else if(you - com == 1) System.out.print(" You won");
        else if(you + com == 2)
        {
            if(you == 0) System.out.print(" You won");
            else System.out.print(" You lose");
        }
        else System.out.print(" You lose");
    }
}
