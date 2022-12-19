import java.util.Scanner;

public class l9{
public static void main(String arg[]){
try (Scanner scan = new Scanner(System.in)) {
    System.out.println("enter matrix size");
    int x=scan.nextInt();
    int y=scan.nextInt();
    int[][] a=new int[10][10];
    for(int i=0;i<x;i++){
    for(int j=0;j<y;j++){
        a[i][j]=scan.nextInt();
    }
}

    int[][] b=new int[10][10];
    for(int i=0;i<x;i++){
    for(int j=0;j<y;j++){
        b[j][i]=a[i][j];
        
    }
    



}
for(int i=0;i<x;i++){
    for(int j=0;j<y;j++){
       System.out.print(b[i][j]);
        
    }
    System.out.println("");
}
}
}
}