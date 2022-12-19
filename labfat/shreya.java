
public class shreya {

    public static void main(String[] args) {
        int mid = 22;
        int end =10;
        int count = 0;
        float percentage = 0.0f;
        int a[][] = new int[2][];
        a[0] = new int[mid];
        a[1] = new int[end];
        fillArray(a);
        print(a);
        for (int[] terms : a){
            for (int day : terms){
            if(day == 1)
                count++;
            }
        }
        percentage = count*100f/32;
        System.out.printf("Percentage = %.2f",percentage);
        System.out.printf("%.2s", " %");
    }
    
    public static int randomAttendance() {
         return (int)(Math.random()*2);
    }
    
    public static void fillArray(int[][] a) {
        for (int i=0; i<a.length; i++)
            for(int j=0; j<a[i].length; j++)
                a[i][j] = randomAttendance();
    }
    
    public static void print(int[][] a) {
        System.out.println("Attendance Array: ");
        for (int[] terms : a){
            for (int day : terms){
                System.out.print(" " + day);
            }
            System.out.println(" ");
        }
    }
}