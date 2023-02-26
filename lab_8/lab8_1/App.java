import java.util.*;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.print("Input 3 sides of the triangle: ");
        String sidesStr = scanner.nextLine();
        System.out.print("The color is: ");
        String color = scanner.nextLine();
        System.out.print("The triangle is filled (y/n): ");
        String filledStr = scanner.nextLine();
        
        System.out.println("----------------------------");

        String[] sidesLst = sidesStr.split(" ");
        double sideA = Integer.parseInt(sidesLst[0]);
        double sideB = Integer.parseInt(sidesLst[1]);
        double sideC = Integer.parseInt(sidesLst[2]);
        boolean filled = getBoolFilled(filledStr);

        GeometricObject triangle = new Triangle(sideA,sideB,sideC,color,filled); 
        System.out.println(triangle);   

    }

    public static boolean getBoolFilled(String filledStr){
        if(filledStr.compareTo("y")==0){
            return true;
        }
        else{
            return false;
        }
    }
}
