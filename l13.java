import java.util.Scanner;
public class l13 {
   public int x,y;
   public double r;
   l13(int x,int y){
this.x=x;
this.y=y;
   };
   l13(){
      
         };
   l13 add(l13 lab){
      l13 lab2=new l13();
      lab2.x=lab.x+x;
      lab2.y=lab.y+y;
      return lab2;
   }
   l13 diff(l13 lab){
      l13 lab2=new l13();
      lab2.x=lab.x-x;
      lab2.y=lab.y-y;
      return lab2;
   }
   public double cir(){
      return 2*3.14*r;
   }
   public double are(){
      return r*3.14*r;
   }
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    String s1;
    System.out.println("enter string");
    s1=scan.nextLine();
    System.out.println("enter chracter");
    char c1;
    char c2;
    c1=scan.next().charAt(0);
   
    System.out.println("enter replace");
    c2=scan.next().charAt(0);
    
       int len =s1.length();
    for (int j = 0; j <len ; j++) {
       if (c1==s1.charAt(j)) {
        s1=s1.substring(0, j)+c2+s1.substring(j+1);
       }
    }
    System.out.println(s1);
   
    scan.close();
   } 
}
