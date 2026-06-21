package Day25;

import java.util.Arrays;
import java.util.Scanner;

public class code97 {
    static void sort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    static int[] merged(int []arr1,int []arr2){
        int [] merge=new int[arr1.length+arr2.length];
        int position=0;
        for(int i=0;i<arr1.length;i++){
            merge[i]=arr1[i];
            position++;
        }
        for(int i=0;i<arr2.length;i++){
            merge[position]=arr2[i];
            position++;
        }
        sort(merge);
        return merge;
    }
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the length");
        int l1=n.nextInt();
        int [] arr1=new int[l1];
        for(int i=0;i<l1;i++){
            System.out.println("enter "+i+"th Element");
            arr1[i]=n.nextInt();//input
        }
        System.out.println("Enter the length");
        int l2=n.nextInt();
        int [] arr2=new int[l2];
        for(int i=0;i<l2;i++){
        System.out.println("enter "+i+"th Element");
        arr2[i]=n.nextInt();//input
        }
        System.out.println("The sorted merged array:"+Arrays.toString(merged(arr1, arr2)));
    }
}
