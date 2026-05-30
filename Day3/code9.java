package Day3;
import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }
        else {
            for(int i=2;i<n;i++){
            temp=n%i;
            if(temp==0){
                isPrime=false;
                break;
            }
        }
        }
        if(isPrime){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }

    }
    
}
