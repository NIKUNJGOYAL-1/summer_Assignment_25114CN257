package Day6;
import java.util.Scanner;
public class code22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to convert");
        long n=sc.nextLong();
        long exp=0;
        long DecimalNumber=0;
        while(n>0){
            long digit=n%10;
            if(digit!=0 && digit!=1){
                System.out.println("error :wrong input");
                return;
            }
             DecimalNumber+=digit*(long)Math.pow(2, exp);
             exp++;
             n/=10;
        }
        System.out.println("The Deciaml digit is:"+DecimalNumber);
        sc.close();
    }
}