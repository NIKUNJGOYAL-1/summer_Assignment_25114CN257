package Day24;
import java.util.*;
public class code95 {
    static String longestWord(String str1){
      if(str1.isEmpty()||str1==null){
        return"";
      }
      String[] words=str1.split("\\s+");
      String longestWord="";
      for(String word:words){
        String cleanword=word.replaceAll("[^a-zA-Z]","");
        if(cleanword.length()>longestWord.length()){
            longestWord=cleanword;
        }
      }
      return longestWord;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String str1=sc.nextLine();
        System.out.println("Longest word:"+longestWord(str1));
    }
}
