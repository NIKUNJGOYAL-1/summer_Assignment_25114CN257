package Day17;
import java.util.*;
public class code68 {
        static int[] common(int[]arr1,int[] arr2){
            int temp[]=new int[arr1.length+arr2.length];
            int count=0;
            for(int j=0;j<arr1.length;j++){
                for(int i=0;i<arr2.length;i++){
                    if(arr1[j]==arr2[i]){
                        temp[count]=arr2[i];
                        count++;
                    }
                }
            }
            int []result=new int[count];
            for(int i=0;i<count;i++){
                result[i]=temp[i];
            }
            return result;
    }
            public static void main(String[] args) {
            Scanner n=new Scanner(System.in);
            System.out.println("Enter the length of the array");
            int l=n.nextInt();
            int [] arr1=new int[l];
            for(int i=0;i<l;i++){
                System.out.println("enter "+i+"th Element");
                arr1[i]=n.nextInt();//input
        }
        System.out.println("Enter the length of the array");
        int len=n.nextInt();
        int [] arr2=new int[len];
        for(int i=0;i<len;i++){
        System.out.println("enter "+i+"th Element");
        arr2[i]=n.nextInt();//input
        }
        System.out.println("The common elements of arrays:"+Arrays.toString(common(arr1, arr2)));//output
    }
}
