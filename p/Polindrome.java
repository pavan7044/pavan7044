import java.util.Scanner;

class Palindrome
{
	static void p(){
		int a,b=0,c,n;
		System.out.println("enter n value");

		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0){
			a=n%10;
			b=b*10+a;

			n=n/10;++
		}
		if(c==b)
			System.out.println("it is polindrome number");
		else
			System.out.println("it not a polindrome number");
	}
	public static void main(String args[]){
		// Polindrome v= new Polindrome();
		p();
}


}
