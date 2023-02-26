import java.util.Scanner;
import java.util.Random;

public class lab3_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Random rand = new Random();
        boolean inputError = false;
        System.out.print("Enter the size for the matrix: ");
        int num = scanner.nextInt();
        if(num<2) inputError = true;
        if(num<0) num*=-1;
        int matrix[][] = new int[num][num];
        for(int i=0;i<num && !inputError;i++){
            for(int j=0;j<num;j++){
                matrix[i][j]=rand.nextInt(2); 
                System.out.print(matrix[i][j]);
                if(j!=num-1) System.out.print(" ");
            }
            System.out.println();
        }
        if(inputError) System.out.println("INPUT ERROR!");
        else checkMatrix(matrix, num);
    }

    public static void checkSubdiagonal(int[][] matrix,int size){
        boolean haveSame = false;
        int same = 0;
        for(int i=0;i<size-1;i++){
            if(matrix[1][0]==matrix[i+1][i]){
                same++;
                if(same==size-1){
                    System.out.println("All "+ matrix[1][0] +"s on the subdiagonal");
                    haveSame = true;
                }
            }
            else break;
        }
        if(!haveSame) System.out.println("No same numbers on a subdiagonal");
    }

    public static void checkSuperdiagonal(int[][] matrix,int size){
        boolean haveSame = false;
        int same = 0;
        for(int i=0;i<size-1;i++){
            if(matrix[0][1]==matrix[i][i+1]){
                same++;
                if(same==size-1){
                    System.out.println("All "+ matrix[0][1] +"s on the superdiagonal");
                    haveSame = true;
                }
            }
            else break;
        }
        if(!haveSame) System.out.println("No same numbers on a superdiagonal");
    }

    public static void checkDiagonal(int[][] matrix,int size){
        boolean haveSame = false;
        int same = 0;
        for(int i=0;i<size;i++){
            if(matrix[0][0]==matrix[i][i]){
                same++;
                if(same==size){
                    System.out.println("All "+ matrix[0][0] +"s on the diagonal");
                    haveSame = true;
                }
            }
            else break;
        }
        if(!haveSame) System.out.println("No same numbers on a diagonal");
    }

    public static void checkColumn(int[][] matrix,int size){
        boolean haveSame = false;
        for(int i=0;i<size;i++){
            int same = 0;
            for(int j=0;j<size;j++){
                if(matrix[0][i]==matrix[j][i]){
                    same++;
                    if(same==size){
                        System.out.println("All "+ matrix[0][i] +"s on column " + i);
                        haveSame = true;
                    }
                }
                else break;
            }   
        }
        if(!haveSame) System.out.println("No same numbers on a column");
    }

    public static void checkRow(int[][] matrix,int size){
        boolean haveSame = false;
        for(int i=0;i<size;i++){
            int same = 0;
            for(int j=0;j<size;j++){
                if(matrix[i][0]==matrix[i][j]){
                    same++;
                    if(same==size){
                        System.out.println("All "+ matrix[i][0] +"s on row " + i);
                        haveSame = true;
                    }
                }
                else break;
            }   
        }
        if(!haveSame) System.out.println("No same numbers on a row");
    }

    public static void checkMatrix(int[][] matrix,int size){
        checkRow(matrix, size);
        checkColumn(matrix, size);
        checkSuperdiagonal(matrix, size);
        checkDiagonal(matrix, size);
        checkSubdiagonal(matrix, size);
    }
}
