package Day14;
import java.util.Scanner;
public class code55 {
    public static int secondLargest(int[] Arr){
        int temp;
        for(int i=0;i<Arr.length;i++){
            for(int j=i+1;j<Arr.length;j++){
                if(Arr[i]<Arr[j]){
                    temp=Arr[i];
                    Arr[i]=Arr[j];
                    Arr[j]=temp;
                }
            }
        }
        return Arr[1];
    }
public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the length of the array");
            int l=sc.nextInt();
            int [] arr=new int[l];
            for(int i=0;i<arr.length;i++){
            System.out.println("enter "+i+"th Element");
            arr[i]=sc.nextInt();
        }
        System.out.println("The second largest number is:"+ secondLargest(arr));
    }
}
