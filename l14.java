class shape{
int s;
shape(){}

};

class square extends shape{
square(int a){
        s=a;
        }
int area(){
System.out.print(s*s);
return 0;
}

}
public class l14{
public static void main(String arg[]){
square v=new square(12);
v.area();



}

}