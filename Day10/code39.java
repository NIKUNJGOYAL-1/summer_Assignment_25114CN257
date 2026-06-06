package Day10;

public class code39 {
    public static void main(String[] args) {
        int rows=5;
        int n=1;
          for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            } 
            for(int k=i-1;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
    }
}
}
