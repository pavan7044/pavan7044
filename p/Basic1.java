// To Display the Given char is vowel or Constant

import java.util.Scanner;
import java.util.*;

class Vowel
{
	
	public static void showChar(){
         char ch;
		System.out.println("enter a char");

		Scanner sc= new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='a')
		{
			System.out.println("Vowel is "+ch);
		}
		else if(ch=='e')
		{
			System.out.println("Vowel is "+ch);
		}
		else if(ch=='i')
		{
			System.out.println("Vowel is "+ch);
		}
		else if(ch=='o')
		{
			System.out.println("Vowel is "+ch);
		}
		else if(ch=='u')
		{
			System.out.println("Vowel is "+ch);
		}
		
		else
		{
			System.out.println("Consonent is a "+ch);
		}
	}


public static void main(String args[]){
	
       showChar();
}

}