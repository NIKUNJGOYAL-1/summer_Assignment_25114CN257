package Day18;

import java.util.*;

public class code71 {
    static int binarySearch(int []arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
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
        Arrays.sort(arr);
        System.out.println("The sorted array used:"+Arrays.toString(arr));
        System.out.println("Enter target");
        int tg=n.nextInt();
        if(binarySearch(arr, tg)==-1){
            System.out.println("target not found");
        }
        else{
            System.out.println("The target found at:"+binarySearch(arr, tg));
        }
        n.close();
    }
}
