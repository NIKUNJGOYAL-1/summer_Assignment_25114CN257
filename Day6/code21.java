package Day6;

import java.util.Scanner;

public class code21{
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to convert to binary");
        long n=sc.nextLong();
        long BinaryNumber=0;
        long PlaceValue=1;
        while(n>0){
            long remainder=n%2;
            BinaryNumber+=PlaceValue*remainder;
            PlaceValue*=10;
            n/=2;
        }
        System.out.println("The Binary Representation is:"+BinaryNumber);
        sc.close();
   }
}
