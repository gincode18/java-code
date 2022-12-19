import java.util.Scanner;

public class l7 {
public static void main(String arg[]){
try (Scanner scan = new Scanner(System.in)) {
    int[] a=new int[30];
    System.out.println("lenght of array");
    int x=scan.nextInt();
    for(int i=0;i<x;i++){
    a[i]=scan.nextInt();
      }
    int[] d=new int[30];
    int[] c=new int[30];
  System.out.println("element to delete");
  int del=scan.nextInt();
  for(int i=0;i<x;i++){
    if(del==a[i]){
    for(int j=0;j<x;j++){
        if(j<i){
        d[j]=a[j];
        }
        else{
            d[j]=a[j+1];
        }
       
    }
    }
  }
  for(int i=0;i<x-1;i++){
    System.out.println(d[i]);
  }
  System.out.println("element to insert and its index");
  int ins=scan.nextInt();
  System.out.println("index");
  int y=scan.nextInt();
  for(int i=0;i<x;i++){
   if(i<y){
    c[i]=d[i];
   }
   if(i==y){
    c[i]=ins;
   }
   if(i>y){
    c[i]=d[i-1];
   }
  }
  for(int i=0;i<x;i++){
    System.out.println(c[i]);
  }
  
}



}
}
