class Building{

    String NAME;
    String city;
    int year;

}
class details extends Building{
int capacity;
float charge;
int noofclassroom;
details(String x,String y,int z,int a,float b,int c){
NAME=x;
city=y;
year=z;
capacity=a;
charge=b;
noofclassroom=c;
}
public String toString()
{
    return NAME + " " + city + " " + z + " " + capacity + " " + charge + " " + noofclassroom;
}



}
class aks