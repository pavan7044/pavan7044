// prg for Nested if  loop
// write a prg to display largest number among three numbers 
// write a prg to  swaping of two numbers and three numbers and four numbers also withuot using third variable  
// c=a  , a=b   ,  b=c








import java.util.*;
import java.util.Scanner;

class Nestedif{

int x,y;

public void checkData(){

Scanner sc= new Scanner(System.in);

System.out.println("enter x number ");

x= sc.nextInt();
System.out.println("enter y number ");
y= sc.nextInt();

if(x>y)
{
System.out.println("x is "+x);
}
else
{
System.out.println("y is  "+y);
}
}
public static void main(String args[]){
Nestedif V= new Nestedif();
V.checkData();
}

}
