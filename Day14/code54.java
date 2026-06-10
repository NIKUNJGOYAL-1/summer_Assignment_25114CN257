package Day14;
import java.util.Scanner;
public class code54 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the length of the array");
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
            System.out.println("enter "+i+"th Element");
            arr[i]=sc.nextInt();
        }
            boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
           if(visited[i]){
            continue;
           }
           int count=1;
           for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
                visited[j]=true;
            }
           }
           System.out.println(arr[i]+" occurs "+count+" times ");
        }
        sc.close();
    }
}
