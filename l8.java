import java.util.Scanner;

public class l8 {
public static void main(String arg[]) {
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
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            System.out.print(a[i][j]);
        }
        System.out.println("");
        
        }
        int sum=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                sum+=a[i][j];
            }
           
            
            }
            System.out.println("sum");
            System.out.println(sum);
            System.out.println("avg");
            System.out.println(sum/(x*y));
            int max=a[0][0];    
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                   if(a[i][j]>max){
                    
                    max=a[i][j];
                   }
                }
               
                
                }
                int min=a[0][0];
                for(int i=0;i<x;i++){
                    for(int j=0;j<y;j++){
                       if(a[i][j]<min){
                        
                        min=a[i][j];
                       }
                    }
                   
                    
                    }
                    System.out.println("max");
            System.out.println(max);
            System.out.println("min");
            System.out.println(min);
}
        }    
    }
   



    

