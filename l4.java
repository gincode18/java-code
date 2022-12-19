import java.util.Scanner;

public class l4 {
public static void main(String arg[]){
try (Scanner scan = new Scanner(System.in)) {
    int[] a=new int[30];
    int x=scan.nextInt();
    for(int i=0;i<x;i++){
    a[i]=scan.nextInt();
      }
    
    int even=0,odd=0;
    for(int i=0;i<x;i++){
    if(a[i]%2==0){
        even++;
    }
    else{
        odd++;
        }
    }
    System.out.println("even");
    System.out.println(even);
    System.out.println("odd");
System.out.println(odd);
}



}
}
