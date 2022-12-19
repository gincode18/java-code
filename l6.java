import java.util.Scanner;

public class l6 {
public static void main(String arg[]){
try (Scanner scan = new Scanner(System.in)) {
    int[] a=new int[30];
    System.out.println("length of array ");
    int x=scan.nextInt();
    for(int i=0;i<x;i++){
    a[i]=scan.nextInt();
      }
      System.out.println("elemnt to find ");
    int y=scan.nextInt();
    int count=0;

    for(int i=0;i<x;i++){
        if(y==a[i]){
        System.out.println("index of elment is ");
        System.out.println(i);
        count++;
        }
    

    }
    if(count==0){System.out.println("nont found ");}
}




}
}
