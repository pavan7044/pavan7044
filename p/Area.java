import java.util.Scanner;

class Area{
public static void main(String args[]){
 int r;
 double pi=3.14,area;
 System.out.println("enter a radius");
 Scanner sc=new Scanner(System.in);
r=sc.nextInt();
area = pi*r*r;
System.out.println("area if a circle"+area);
}
}





