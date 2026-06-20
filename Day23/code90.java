package Day23;
import java.util.*;
public class code90 {
            public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text=sc.nextLine();
        char result='_';
        for(int i=0;i<text.length();i++){
            boolean isRepeating=false;
            char ch=text.charAt(i);
            if(ch==' ') continue;
            for(int j=i+1;j<text.length();j++){
                if(i != j && text.charAt(j)==ch){
                    isRepeating=true;
                    break;
                }
            }
             if(isRepeating){
                result= ch;
                break;
             }
        }
        if(result=='_'){
            System.out.println("There are no non repeating characters");
        }
        else{
            System.out.println("The "+result+" is the first repeating character");
        }
        sc.close();
    }
}
