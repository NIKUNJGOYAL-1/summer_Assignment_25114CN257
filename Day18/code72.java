package Day18;
import java.util.*;
public class code72 {
          static void descendingSort(int []arr){
        //loop to switch the elements ascending order or bubble sort
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                //checks if the element at ith position is greater than element jth position
                if (arr[i]<arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
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
        descendingSort(arr);
        System.out.println("The sorted array:"+Arrays.toString(arr));
        n.close();
    }
}
