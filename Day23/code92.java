package Day23;

import java.util.*;

public class code92 {
    static char maxOccur(String text){
        boolean []visited = new boolean[text.length()];
        int maxCount=0;
        char maxChar='_';
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            int count=0;
            if(visited[i]){
                continue;
            }
            for(int j=i+1;j<text.length();j++){
                if(c==text.charAt(j)){
                    visited[j]=true;
                    count++;
                }
            }
            if(maxCount<count){
                maxCount=count;
                maxChar= c;
            }
        }
        return maxChar;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text1=sc.nextLine();
        System.out.println("The maximum occuring character:"+maxOccur(text1));
    }
}
