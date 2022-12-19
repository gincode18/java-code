import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import java.text.CollationElementIterator;

class vishal{
int x;
int y;


}
class myexception extends Exception{
    myexception(String z){

        super(z);
    }
}



public class test1{
public static void main(String args[]){

ArrayList<Integer> v=new ArrayList<Integer>();
v.add(2);
System.out.println(v.get(0));
LinkedList <Integer> l =new LinkedList<Integer>();
l.add(10);
l.add(1);
l.add(20);
l.add(30);
l.add(450);
l.sort(null);
Collections.addAll(l,10,32);
System.out.println(l.toString());
System.out.println(l.toString().substring(1, 27));
myexception e=new myexception("vishal");

System.out.println(e.getMessage());
try{    
    FileOutputStream fout=new FileOutputStream("testout.txt");    
    String s="Welcome to javaTpoint.";    
    byte b[]=s.getBytes();//converting string into byte array    
    fout.write(b);    
    fout.close();    
    System.out.println("success...");    
   }catch(Exception eb){System.out.println(eb);}        
}
}