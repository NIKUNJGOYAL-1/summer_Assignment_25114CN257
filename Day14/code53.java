package Day14;

import java.util.Scanner;

public class code53 {
     public static int linearSearch(int [] arr,int target){
         for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
         }
         return -1;
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
        System.out.println("enter the number to search");
        int target=sc.nextInt();
        int result=linearSearch(arr, target);
        if(result>=0){
            System.out.println("The Target found at:"+result);
        }
        else{
            System.out.println("--Target not found--");
        }
        sc.close();
     }
}
