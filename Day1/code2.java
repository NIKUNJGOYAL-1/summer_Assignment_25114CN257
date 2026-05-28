package Day1;

import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int multi;
    for(int i=1;i<=10;i++){
        multi=n*i;
        System.out.println(multi);
    }
}
}