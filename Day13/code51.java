package Day13;
import java.util.Scanner;
public class code51 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the length of the array");
            int l=sc.nextInt();
            int [] arr=new int[l];
            for(int i=0;i<arr.length;i++){
            System.out.println("enter "+i+"th Element");
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        //loop to find minimum and maximum element
        for(int i=1;i<l;i++){
           if(arr[i]<min){//updates minimum
            min=arr[i];
           }
           if(arr[i]>max){//updates maximum
            max=arr[i];
           }
        }
        System.out.println("the smallest and maximum element:"+min+","+max);
    }
}
