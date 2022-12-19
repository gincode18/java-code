

import java.util.Scanner;
import java.util.Arrays;
class Employee{
int empid;
String empname;
String designation;
String Experience;
String salary;

}
class onSiteprojects extends Employee{
int projectid;
String companyname;
String joblocation;
onSiteprojects(int a,String b,String c,String d,String e,int f,String g,String h){
     empid=a;
     empname=b;
     designation=c;
     Experience=d;
     salary=e;
 projectid=f;
 companyname=g;
 joblocation=h;  
}

}

class TrainingProgram extends Employee{
String programname;
int Duration;
TrainingProgram(int a,String b,String c,String d,String e,String f,int g){
    empid=a;
    empname=b;
    designation=c;
    Experience=d;
    salary=e;
programname=f;
Duration=g;

}
}
class kartik{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int n;
n=sc.nextInt();
TrainingProgram[] t=new TrainingProgram[n];
onSiteprojects[] o=new onSiteprojects[n];
for (int i = 0; i < n; i++) {
    int a=sc.nextInt();
    String b=sc.nextLine();
    String c=sc.nextLine();
    String d=sc.nextLine();
    String e=sc.nextLine();
    String f=sc.nextLine();
    int g=sc.nextInt();
    t[i]=new TrainingProgram(a, b, c, d, e, f, g);
}
for (int i = 0; i < n; i++) {
   if(t[i].Duration<3){
    System.out.println(t[i].empname);
   } 
}
for (int i = 0; i < n; i++) {
    int a=sc.nextInt();
    String b=sc.nextLine();
    String c=sc.nextLine();
    String d=sc.nextLine();
    String e=sc.nextLine();
    int f=sc.nextInt();
    String g=sc.nextLine();
    String h=sc.nextLine();
    o[i]=new onSiteprojects(a, b, c, d, e, f, g,h);
}
for (int i = 0; i < n; i++) {
    if (o[i].joblocation=="Ontario") {
System.out.println(o[i].empname);        
    }
}
}}