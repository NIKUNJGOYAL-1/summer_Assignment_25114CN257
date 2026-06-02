package Day6;

import java.util.Scanner;

public class code23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to convert to binary");
        long n=sc.nextLong();
        long BinaryNumber=0;
        long PlaceValue=1;
        //loop to covert decimal to binary
        while(n>0){
            long remainder=n%2;
            BinaryNumber+=PlaceValue*remainder;
            PlaceValue*=10;
            n/=2;
        }
         long SetBits=0;
         //loop to find set bits
         while(BinaryNumber>0){
            long digit=BinaryNumber%10;
            if(digit==1){
                SetBits++;
            }
            BinaryNumber/=10;
         }
         System.out.println("the set bits in the number is:"+SetBits);
        sc.close();
    }
}
