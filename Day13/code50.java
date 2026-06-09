package Day13;
import java.util.Scanner;
public class code50 {
public static void main(String[] args) {
    int sum=0;
    int average;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the length of the array");
            int l=sc.nextInt();
            int [] arr=new int[l];
            for(int i=0;i<arr.length;i++){
            System.out.println("enter "+i+"th Element");
            arr[i]=sc.nextInt();
        }
            for (int i = 0; i < l; i++) {
                sum+=arr[i];
            }
            average=sum/l;
            System.out.println("The sum and Average is:"+sum+","+average);
        }       
    }


