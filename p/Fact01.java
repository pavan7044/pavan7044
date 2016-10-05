import java.util.Scanner;

class Fact01{

static int a,n;
static double sum=1;
public static void main(String args[]){
System.out.println("enter a factorial number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(a=1;a<=n;a++)
{
sum=sum*a;
System.out.println(sum+"*"+a);
}
System.out.println(sum);
}
}