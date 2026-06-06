package Day10;

public class code38 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=rows;i>0;i--){
            for(int j=rows-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=(i*2)-1;k>0;k--){
                System.out.print("*");  
            }
            System.out.println();
        }
    }
}
