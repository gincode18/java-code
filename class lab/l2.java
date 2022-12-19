import java.util.Scanner;

class l2{  
    public static void main(String args[])  
    {    
     int n1=0,n2=1,n3,i;
     try (Scanner scan = new Scanner(System.in)) {
      int x=scan.nextInt();    
       System.out.print(n1+" "+n2);    
          
       for(i=2;i<x;++i)    
       {    
        n3=n1+n2;    
        System.out.print(" "+n3);    
        n1=n2;    
        n2=n3;    
       }    
        scan.close();
    }
    }}  