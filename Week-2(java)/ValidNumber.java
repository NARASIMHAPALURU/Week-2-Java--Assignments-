import java.util.*;
class ValidNumber{
	public static void main (String [] args){
		try{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println( n +" is a valid number: ");
		}
		catch(InputMismatchException e)
		{
			System.out.print("It is not a number");
		}
	}
}
