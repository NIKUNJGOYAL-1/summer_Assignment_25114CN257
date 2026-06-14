package Day18;

import java.util.Arrays;
import java.util.Scanner;
public class code70 {
      static void selectionSort(int []arr){
        //loop to switch the elements ascending order or bubble sort
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                //checks if the arr[i] greater than arr[j]
                if (arr[i]>arr[j]){
                    minIndex=j;
                }
            }
            int temp =arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }  
    }
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("enter length");
        int length=n.nextInt();
        int []arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.println("enter "+i+"th Element");
            arr[i]=n.nextInt();
        }
        selectionSort(arr);
        System.out.println("The sorted array:"+Arrays.toString(arr));
        n.close();
    }
}

