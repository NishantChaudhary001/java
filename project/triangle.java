package project;
import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if(a==b && a!=c || b==c && b!=a ||c==a&& c!=b)
{
	System.out.println("issoscales triangle:");
}
else if(a!=b && b!=c && a!=c)
{
	System.out.println("Scallen triangle: ");
}
else
{
	System.out.println("Equilateral triangle:");
}
	}

}
