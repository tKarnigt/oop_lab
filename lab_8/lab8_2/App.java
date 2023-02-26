import java.util.*;

public class App {
  static Scanner scanner = new Scanner(System.in);
  static Scanner scannerStr = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    System.out.print("Creating circle 1, input radius: ");
    double radiusCircleA = scanner.nextDouble();
    System.out.print("Creating circle 2, input radius: ");
    double radiusCircleB = scanner.nextDouble();
    GeometricObject circleA = new Circle(radiusCircleA);
    GeometricObject circleB = new Circle(radiusCircleB);
    System.out.println("------------------------");
    System.out.printf("The max circle's radius is %.1f\n", max(circleA, circleB).getRadius());
    System.out.println("========================");
    
    System.out.print("Creating rectangle 1, input width and height: ");
    String[] WHRectangleA = scannerStr.nextLine().split(" ");
    System.out.print("Creating rectangle 2, input width and height: ");
    String[] WHRectangleB = scannerStr.nextLine().split(" ");
    GeometricObject RectangleA = new Rectangle(Double.parseDouble(WHRectangleA[0]), Double.parseDouble(WHRectangleA[1]));
    GeometricObject RectangleB = new Rectangle(Double.parseDouble(WHRectangleB[0]), Double.parseDouble(WHRectangleB[1]));
    max(RectangleA, RectangleB);
    System.out.println("------------------------");
    System.out.printf("The max rectangle's width and height are %.1f, %.1f\n", max(RectangleA, RectangleB).getWidth(), max(RectangleA, RectangleB).getHeight());
    System.out.println("========================");
  }

  public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
    if (o1.getArea() > o2.getArea()) {
      return o1;
    } 
    else {
      return o2;
    }
  }

}
