package Day8;

public class code30 {
    public static void main(String[] args) {
    int n=1;
    int rows=5;
    for(int i=0;i<rows;i++){
        for(int j=0;j<=i;j++){
            System.out.print(n);
            n++;
        }
        System.out.println();
        n=1;
    }
    }
}
