package project;
import java.util.Scanner;
public class trianglevalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int angle = a+b+c;
if(angle == 180) {
System.out.println("The triangle is valid:"+ angle);
	}
	else
	{
		System.out.println("not");
	}

  }
}