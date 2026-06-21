package Day24;

import java.util.Scanner;

public class code93 {
    static boolean isRotation(String str1,String str2){
        if(str1==null || str2==null){
            return false;
        }
              if(str1.length()!=str2.length()){
                return false;
              }
              String merged=str1+str1;
              return merged.contains(str2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String str1=sc.nextLine();
        System.out.println("enter target string");
        String str2=sc.nextLine();
        System.out.println("The target string is rotation of given string:"+isRotation(str1, str2));
        sc.close();
    }
}
