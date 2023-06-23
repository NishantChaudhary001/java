package project;
import java.util.Scanner;
public class nocheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if(a<0)
{
	System.out.println("The no. is negative:");
}
else if (a>0)
{
	System.out.println("The no. is positive:");
}
else
{
	System.out.println("the no. is zero:");
}
	}

}
