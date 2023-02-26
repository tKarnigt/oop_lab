import java.util.Scanner;

public class lab3_2 {
    static Scanner scanner = new Scanner(System.in);
    public static int[] merge(int[] list1, int[] list2){ 
        int[] result = new int[list1.length+list2.length];
        System.arraycopy(list1, 0, result, 0, list1.length);  
        System.arraycopy(list2, 0, result, list1.length, list2.length);  
        int temp = 0;
        for(int i=0; i < result.length; i++){  
            for(int j=1; j < (result.length-i); j++){  
                    if(result[j-1] > result[j]){   
                    temp = result[j-1];  
                    result[j-1] = result[j];  
                    result[j] = temp;  
                }     
            }  
        }  
        return result;
    }
    public static void main(String[] args){
        System.out.print("Enter list1: ");
        String list1Input = scanner.nextLine();
        System.out.print("Enter list2: ");
        String list2Input = scanner.nextLine();
        String list1[] = list1Input.split(" ");
        String list2[] = list2Input.split(" ");
        int numList1[] = new int[list1.length];
        int numList2[] = new int[list2.length];
        for(int i = 0;i<list1.length;i++){
            numList1[i] = Integer.parseInt(list1[i]);
        }
        for(int i = 0;i<list2.length;i++){
            numList2[i] = Integer.parseInt(list2[i]);
        }

        int numResult[] = merge(numList1, numList2);

        System.out.print("The merged list is ");
        for(int i:numResult){
            System.out.print(i+" ");
        }
    }
}
