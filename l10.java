import java.util.Scanner;

public class l10 {
public static void main(String arg[]){
try (Scanner scan = new Scanner(System.in)) {
    System.out.println("enter matrix size");
    int x=scan.nextInt();
    
    int[][] a=new int[10][10];
    for(int i=0;i<x;i++){
    for(int j=0;j<x;j++){
        a[i][j]=scan.nextInt();
    }
}
for(int i=0;i<x;i++){
    for(int j=0;j<x;j++){
       System.out.print(a[i][j]);
        
    }
    System.out.println("");
}
for(int i=0;i<x;i++){
    System.out.print(a[i][i]);
   }
int j=x-1;
System.out.println("");
for(int i=0;i<x;i++){
    while(j>=0){
    System.out.print(a[i][j]);
    j--;
    break;
    }
    
   }



}
}
}
