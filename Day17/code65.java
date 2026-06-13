package Day17;

import java.util.*;
public class code65 {
     static int[] mergeArray(int[]arr1,int[]arr2){
        int position =0;
        int [] merged=new int[arr1.length+arr2.length];
        //loop to paste all elements of first array in merged array
        for (int i=0;i<arr1.length;i++){
            merged[position]=arr1[i];
            position++;
        }
        //loop to paste all elements of second array in merged array
        for (int i=0;i<arr2.length;i++){
            merged[position]=arr2[i];
            position++;
        }
        return merged;
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
        System.out.println("The merged array"+Arrays.toString(mergeArray(arr1, arr2)));//output
    }
}
