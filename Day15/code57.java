package Day15;

import java.util.*;

public class code57 {
    static int[] reverseArray(int []arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l=n.nextInt();
        int [] arr=new int[l];
        for(int i=0;i<l;i++){
            System.out.println("enter "+i+"th Element");
            arr[i]=n.nextInt();
        }
        int [] reversed=reverseArray(arr);
        System.out.println("The reversed array:"+Arrays.toString(reversed));
    }
}
