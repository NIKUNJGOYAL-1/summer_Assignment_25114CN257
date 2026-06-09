package Day13;
import java.util.Scanner;
public class code52 {
    public static void main(String[] args) {
        int even=0;
        int odd=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the length of the array");
            int l=sc.nextInt();
            int [] arr=new int[l];
            for(int i=0;i<arr.length;i++){
            System.out.println("enter "+i+"th Element");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<l;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The even and odd elements in array:"+even+","+odd);
}
}
