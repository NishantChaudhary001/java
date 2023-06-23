package project;
import java.util.Scanner;
public class balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int balance=sc.nextInt();
if(balance<10)
{
	System.out.println("checking amount balance is low");
}
else if(balance<100)
{
	System.out.println("saving account balance is low");
}
else
{
	System.out.println("wrong choice");
}
	}

}
