package Day16;

import java.util.Scanner;

public class code61 {
    static int missingNumber(int[] arr){
       int n=arr.length+1;
       //sum of n natural number
       int ExpSum=(n*(n+1))/2;
       int actualsum=0;
       //sum of all elements
       for(int num:arr){
        actualsum+=num;
       }
       //return difference of sums or we can say the missing number
       return ExpSum-actualsum;
    }
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l=n.nextInt();
        int [] arr=new int[l];
        for(int i=0;i<l;i++){
        System.out.println("enter "+i+"th Element");
        arr[i]=n.nextInt();//input
        }
        System.out.println("The missing number:"+missingNumber(arr));//output
    }
}
