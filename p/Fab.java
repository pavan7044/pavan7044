import java.util.Scanner;


class Fib
{
public static void main(String args[]){
int a=0,b=0,c=1,i=0,n;
System.out.println("enter a number");
Scanner sc= new Scanner(System.in);
 n=sc.nextInt();


	while(i<=n){

a=b;
b=c;
c=a+b;


System.out.println(c);
i++;
}
}
}