// prg for Nested if  loop

import java.util.*;
import java.util.Scanner;

class Nestedif{

int x;

public void checkData(){

Scanner sc= new Scanner(System.in);

System.out.println("enter a number");

x= sc.nextInt();

if((x>0)&&(x>10))
{
System.out.println("+ve number and greater than 10");
}


else
{
System.out.println("-ve number ");
}
}
public static void main(String args[]){
Nestedif V= new Nestedif();
V.checkData();
}
}
