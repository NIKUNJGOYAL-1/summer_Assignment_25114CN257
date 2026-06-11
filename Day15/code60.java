package Day15;
import java.util.*;
public class code60 {
    static void zeroAtEnd(int []arr){
        int nonzero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
             arr[nonzero]=arr[i];
             nonzero++;
            }
        }
        for(int i=nonzero+1;i<arr.length;i++){
            arr[i]=0;
        }
    }
        public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l=n.nextInt();
        int [] arr=new int[l];
        for(int i=0;i<l;i++){
            System.out.println("enter "+i+"th Element");
            arr[i]=n.nextInt();
        }
        zeroAtEnd(arr);
        System.out.println("The final array:"+Arrays.toString(arr));
    }
}
