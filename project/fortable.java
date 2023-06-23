package project;
import java.util.Scanner;
public class fortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int start = sc.nextInt();
int end = sc.nextInt();
for(int i=start;i<=end;i++)
{
	for(int j=1;j<=10;j++)
	{
		System.out.println(i+"*"+j+"="+(j*i));
	}
}

	}

}
