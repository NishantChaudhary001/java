package project;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n =sc.nextInt();
int r;
int sum=0;
for(int i=1;i<n;i++)
{
	if(n>1) {
n=n%10;
r=n/10;
sum=sum+(r*r*r);
System.out.println("it is a Armstrong no.");}
	else
	{
		System.out.println("it is a not a Armstrong no.");
	}
}

	}

}
