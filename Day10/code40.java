package Day10;

public class code40 {
    public static void main(String[] args) {
        int rows=5;
        int n=1;
          for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            } 
            c-=2;
            for(int k=i-1;k>=1;k--){
                System.out.print(c);
                c--;
            }
            System.out.println();
    }
    }
}
