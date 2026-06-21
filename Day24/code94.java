package Day24;

import java.util.*;

public class code94 {
    static String compress(String str){
        if(str==null||str.isEmpty()){
            return "error--empty string found--";
        }
        StringBuilder compressed=new StringBuilder();
        int count=1;
        for(int i=0;i<str.length();i++){
            if (i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                compressed.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        return compressed.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text1=sc.nextLine();
        System.out.println("The compressed string:"+compress(text1));
    }
}
