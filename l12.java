import java.util.Scanner;

public class l12 {
public static void main(String arg[]){
try (Scanner scan = new Scanner(System.in)) {
    System.out.println("enter matrix size");
    int x=scan.nextInt();
    int y=scan.nextInt();
    
    int[][] a=new int[10][10];
    int[] row=new int[10];
    int[] col=new int[10];
    for(int i=0;i<x;i++){
    for(int j=0;j<y;j++){
        a[i][j]=scan.nextInt();
    }
}
for(int i=0;i<x;i++){
    for(int j=0;j<y;j++){
       System.out.print(a[i][j]);
        
    }
    System.out.println("");
}


for(int i=0;i<x;i++){
    for(int j=0;j<y;j++){
    row[i]+=a[i][j];
    }
}
for(int i=0;i<y;i++){
    for(int j=0;j<x;j++){
    col[j]+=a[i][j];
    }
}
System.out.print("row");
for(int j=0;j<x;j++){
   System.out.print(row[j]);
   System.out.print(" ");
    }
    System.out.print("col");
    for(int j=0;j<y;j++){
        System.out.print(col[j]);
        System.out.print(" ");
         }
    
   



}
}
}
