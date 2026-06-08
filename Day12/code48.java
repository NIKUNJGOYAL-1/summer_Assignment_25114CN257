package Day12;
import java.util.Scanner;
public class code48 {
    public static boolean isPerfect(int x){
        int sum=0;
        //loop to find sum of factors
        for(int i=1;i<=x/2;i++){
            if(x%i==0){
              sum+=i;
            }
        }
        //checks if the sum of factors itself is equal to the number excluding 
        if(sum==x){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check");
        int n=sc.nextInt();//input
        System.out.println("The number is perfect number:"+isPerfect(n));//output
    }
}
