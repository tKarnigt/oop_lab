import java.util.Random;
public class App
{
    public static void main(String[] args) {
        StopWatch clock = new StopWatch();
        double[] num,sortNum;
        int[] palin;
        System.out.println("Creating a list containing 1000 elements,");
        num=randNum(1000);
        for(int i=0;i<1000;i++){
            if((i+1)%5==0&&i!=0)
            {
                System.out.println(String.format("%.2f",num[i])+" ");
            }
            else
            {
                System.out.print(String.format("%.2f",num[i])+" ");
            }
        }
        System.out.println("List created.\nSorting stopwatch starts...");
        clock.start();
        sortNum=sort(num);
        clock.stop();
        for(int i=0;i<sortNum.length;i++){
            if((i+1)%5==0&&i!=0)
            {
                System.out.println(String.format("%.2f",sortNum[i])+" ");
            }
            else
            {
                System.out.print(String.format("%.2f",sortNum[i])+" ");
            }
        }
        System.out.println("Sorting stopwatch stoped.\nThe sort time is "+clock.getElapsedTime()+" milliseconds.");
        System.out.println("-------------------------------------------------");
        System.out.println("The palindromePrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        clock.start();
        palin=PalindromeGen(1000);
        clock.stop();
        for(int i=0;i<1000;i++){
            if((i+1)%10==0&&i!=0)
            {
                System.out.println(palin[i]+" ");
            }else
            {
                System.out.print(palin[i]+" ");
            }
        }
        System.out.println("PalindromPrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is "+clock.getElapsedTime());
    }
    private static double[] randNum(int num) {
        double[] numberRand;
        numberRand = new double[num];
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            numberRand[i] = rand.nextDouble() * 1000;
        }
        return numberRand;
    }
    private static double[] sort(double arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    private static int[] PalindromeGen(int num) {
        int[] Palindrome;
        Palindrome = new int[num];
        int i = 2, j = 0;
        while (j < num) {
            if (isPalindrome(i)) {
                if (isPrime(i)) {
                    Palindrome[j] = i;
                    i++;
                    j++;
                }
            }
            i++;
        }
        return Palindrome;
    }
    private static boolean isPalindrome(int number) {String str = Integer.toString(number);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    private static boolean isPrime(int number) {
        int m = 0, f = 0;
        m = number / 2;
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
