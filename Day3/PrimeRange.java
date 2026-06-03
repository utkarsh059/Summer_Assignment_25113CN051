import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Start and End values: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Prime numbers are:");
        for(int i = start; i<=end; i++){
            if (i<=1)
                continue;
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i + " ");
        }
        sc.close();
 }
    
}
