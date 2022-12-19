import java.util.Scanner;

public class l5 {
public static void main(String arg[]){
try (Scanner scan = new Scanner(System.in)) {
    int[] a=new int[30];
    int x=scan.nextInt();
    for(int i=0;i<x;i++){
    a[i]=scan.nextInt();
      }
  int count=0;
   for(int i=0;i<=x/2;i++){
    for(int j=2;j<a[i];j++){
        if(a[i]%j==0){
            count++;}
    }
   }
   System.out.println("no of prime elmenets in array");
System.out.println(count);
}



}
}
