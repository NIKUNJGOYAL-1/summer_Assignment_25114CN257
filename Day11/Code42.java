package Day11;

import java.util.Scanner;

public class Code42 {
    public static int findMax(int[] arr){
        if(arr==null||arr.length==0){
            throw new IllegalArgumentException("The array should atleast contain one element");//it throws an exception if user enters length ==0
        }
        int max=arr[0];
        //loop to find maximum number in array
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;//returns the max number from the array given by user
    }
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter array length");
        int l=n.nextInt();//user input length
        int [] arr=new int[l];
        for(int i=0;i<l;i++){//loop to get array from user
            System.out.println("enter element:"+i);
            arr[i]=n.nextInt();
        }    
        System.out.println("The max term is:" + findMax(arr));//final output
    }
}
