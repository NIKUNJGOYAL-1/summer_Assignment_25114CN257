package Day16;
import java.util.*;
public class code63 {
         static int[] findPair(int[] arr,int TargetSum){
            Arrays.sort(arr);
            int left=0;
            int right=arr.length-1;
            while(left<right){
                int currentSum=arr[left]+arr[right];
                if(currentSum==TargetSum){
                    return new int[] {arr[left],arr[right]};
                }
                if(currentSum<TargetSum){
                    left++;
                }
                else{
                    right--;
                }
            }
            return null;
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
        System.out.println("Enter the target sum");
        int targetSum=n.nextInt();
        int []result=findPair(arr,targetSum);
        System.out.println("The pair with target sum is:"+ Arrays.toString(result));
         }

     }
