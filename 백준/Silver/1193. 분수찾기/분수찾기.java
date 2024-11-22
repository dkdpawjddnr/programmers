import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int floor = 1;
       
       while(number-floor > 0) {
          number -= floor;
         floor++;
       }
       
       int box = number; 
       int hap = floor+1;
       int a=0; int b=0; 
       
       if(floor%2==1) {
          a = box;
          b = hap-box;
       }
       
       if(floor%2==0) {
          b = box;
          a = hap - box;
       }
       
       System.out.println(b +"/" + a);
    } 
}