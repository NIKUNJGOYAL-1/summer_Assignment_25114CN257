package Day3;

import java.util.Scanner;

public class code10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println(n + " is the "+n+"th fibonnaci term");
        }
        else{   
            int a=0;
            int b=1;
            int c=0;
            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c + " is the "+n+"th fibonnaci term");
        }
    }
}
