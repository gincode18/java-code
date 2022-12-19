import java.util.Scanner;

public class l3 {
    public static void main(String arg[]){
try (//decimal to binary
Scanner scan = new Scanner(System.in)) {
    System.out.println("decimal to binary");
    int a =scan.nextInt();
    
    int[] b=new int[30];
    int i;
    for(i=0;a>0;i++){
    b[i]=a%2;
    a=a/2;
    
    }
    for(int j=i-1;j>=0;j--){
        System.out.println(b[j]);
    }
    System.out.println("binary to decimal");
    int c=scan.nextInt();
    int sum=0;
    
    while(c!=0){
       
    sum=sum+(c%10)*2^i;
    
    c=c/10;
    }
    System.out.println(sum);
    scan.close();
}

    }
}
