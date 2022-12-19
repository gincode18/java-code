// Your First Program
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
int[] data =new int[5];
data[0]=91;
data[1]=22;
data[2]=33;
data[3]=5;
data[4]=1;
int sum=0;

Arrays.sort(data);
for (int i = 0; i < 5; i++) {
    sum+=data[i];

  }
Scanner scan = new Scanner(System.in);
System.out.println(sum);
System.out.println(sum/5);
System.out.println("min");
System.out.println(data[0]);
System.out.println("max");
System.out.println(data[4]);
int a=scan.nextInt();
for (int i = 0; i < 5; i++) {
if(a==data[i]){
System.out.println("position of elemnt is");
System.out.println(i);
System.out.println("\n");
}

}
scan.close();
}
} 