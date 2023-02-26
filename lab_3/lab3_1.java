public class Lab3_1 {
    public static boolean checkPrime(int num){
        int factor = 0;
        for(int i = 1;i<=num;i++){
            if(num%i==0) factor++;
            if(factor>2) break;
        }
        if(factor==2) return true;
        else return false;
    }

    public static boolean checkPalindromic(int num){
        String number = Integer.toString(num);
        if(number.length()%2==0){
            int loopRound = number.length()/2;
            int sameRound = 0;
            for(int i = 0;i<loopRound;i++){
                if(Character.compare(number.charAt(loopRound-i-1), number.charAt(loopRound+i))==0){
                    sameRound++;
                }
            }
            if(sameRound==loopRound) return true;
            else return false;
        }
        else{
            int loopRound = (number.length()-1)/2;
            int sameRound = 0;
            for(int i = 0;i<loopRound;i++){
                if(Character.compare(number.charAt(loopRound-i-1), number.charAt(loopRound+i+1))==0){
                    sameRound++;
                }
            }
            if(sameRound==loopRound) return true;
            else return false;
        }
    }
    public static void main(String[] args){
        int size = 0;
        int num = 1;
        while(size!=100){
            if(checkPrime(num) && checkPalindromic(num)){
                System.out.print(num + " ");
                size++;
                if(size%10==0) System.out.println();
            }
            num++;
        }
    }
}
