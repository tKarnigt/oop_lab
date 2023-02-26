public class App {
    public static void main(String[] args) throws Exception {
        Rectangle[] rectangle = {
            new Rectangle(4,5),
            new Rectangle(2,10),
            new Rectangle(4,3,"Blue",true)
        };

        for(int i=0;i<3;i++){
            System.out.println("Rectangle "+(i+1));
            System.out.println(rectangle[i]);
            System.out.println();
        }

        if(rectangle[0].compareTo(rectangle[1])==0){
            System.out.println("Rectangle 1 and Rectangle 2 are equal.");
        }
        else System.out.println("Rectangle 1 and Rectangle 2 are NOT equal");

        if(rectangle[1].compareTo(rectangle[1])==2){
            System.out.println("Rectangle 2 and Rectangle 3 are equal.");
        }
        else System.out.println("Rectangle 2 and Rectangle 3 are NOT equal.");
    }
}
