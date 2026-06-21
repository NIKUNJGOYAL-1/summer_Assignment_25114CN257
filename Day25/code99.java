package Day25;
import java.util.*;
public class code99 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of names");
        int l=sc.nextInt();
        sc.nextLine();
        String[]names=new String[l];
        for(int i=0;i<l;i++){
            System.out.println("Enter "+(i+1)+"th name");
            names[i]=sc.nextLine();
        }
        Arrays.sort(names);
        System.out.println("Sorted List");
        for(String name:names){
            System.out.println(name);
        }
        sc.close();
    }
}
