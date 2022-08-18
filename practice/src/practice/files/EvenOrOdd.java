package practice.files;
import java.util.Scanner;
public class EvenOrOdd
{
	static Scanner S=new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("Enter the number");
		int num=S.nextInt();
		if (num%2==0) {	
		System.out.println("The given number"+num+" is even");
		}
		else
		{
			System.out.println("The given number"+num+" is odd");	
		}
	}
}
