// To Display the Given char is vowel or Constant

import java.util.Scanner;
import java.util.*;

class Vowel
{
	
	public void showChar(){
		char ch;
		System.out.println("enter a char");

		Scanner sc= new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || /*there are capital letters */ ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Vowel is "+ch);
		}
		else   
		{
			System.out.println("Consonent  is  "+ch);
		}
	}

	
public static void main(String args[]){
	Vowel V= new Vowel();
       V.showChar();
}

}
