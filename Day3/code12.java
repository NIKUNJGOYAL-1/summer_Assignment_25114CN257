package Day3;
import java.util.Scanner;
public class code12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int lcm=n1;
        if(n2>n1){
            lcm=n2;
        }
        while (true) { 
            if(lcm%n1==0 && lcm%n2==0){
                System.out.println("lcm is:"+lcm);
                break;
            }
            lcm++;
        }}
    }

