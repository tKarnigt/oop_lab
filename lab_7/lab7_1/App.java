import java.util.*;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerBool = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        GeometricObject triangle = new Triangle(3,4,5,"Red",true); 
        displayObject(triangle); 
        System.out.println();

        GeometricObject rectangle = new Rectangle(5,4,"Blue",false); 
        displayObject(rectangle);

        GeometricObject circle = new Circle(14,"Yellow",true); 
        displayObject(circle);
    }

    public static void displayObject(Object object){
        System.out.print(object);
    }
}
