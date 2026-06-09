package Day13;
import java.util.Arrays;
import java.util.Scanner;
public class code49 {
    public static int[] printArray(int[] Arr, Scanner sc){
        for(int i=0;i<Arr.length;i++){
            System.out.println("enter "+i+"th Element");
           Arr[i]=sc.nextInt();
        }
        return Arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int l=sc.nextInt();
        int [] arr=new int[l];
        System.out.println("The array is:"+ Arrays.toString(printArray(arr,sc)));
    }
}