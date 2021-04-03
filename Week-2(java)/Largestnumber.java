import java.util.Scanner;
class Largestnumber{
	public static void main (String [] args){
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1,n2,n3 :");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		if(n1>n2&&n1>n3){
			System.out.println(n1);
		}
		if(n2>n1&&n2>n3){
			System.out.println(n2);
		}
		if(n3>n1&&n3>n2){
			System.out.println(n3);
		}
	}
}
		
		