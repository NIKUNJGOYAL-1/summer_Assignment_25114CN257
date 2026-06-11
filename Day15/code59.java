package Day15;

import java.util.Arrays;
import java.util.Scanner;

public class code59 {
        static void leftRotate(int[] arr,int d){
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
        temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-1-i]=temp;
    }
        d=d%arr.length;
           for(int i=0;i<d/2;i++){
            temp=arr[i];
            arr[i]=arr[d-1-i];
            arr[d-1-i]=temp;
           }
        for(int i=0;i<(arr.length-d)/2;i++){
            temp=arr[d+i];
            arr[d+i]=arr[arr.length-i-1];
            arr[arr.length-1-i]=temp;
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
        System.out.println("Enter the position");
        int d=n.nextInt();
        leftRotate(arr, d);
        System.out.println("The reversed array:"+Arrays.toString(arr));
    }
}
