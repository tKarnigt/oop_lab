public class App {
    public static void main(String[] args) throws Exception {
        Octagon octagonA = new Octagon(8,"Blue",true);
        System.out.println(octagonA);
        System.out.println();

        Octagon octagonB = new Octagon(10,"Brown",true);
        octagonB.clone(octagonA);
        System.out.println(octagonB); 
        System.out.println();

        if(octagonA.compareTo(octagonB)==0) System.out.println("OctagonA and OctagonB are equal.");
        else System.out.println("OctagonA and OctagonB are NOT equal");
    }
}
