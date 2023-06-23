package project;
import java.util.Scanner;
public class divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if(a%5==0 && a%11==0)
{
	System.out.println("The no. is divisile by 5 and 7");
}
else
{
	System.out.println("no");
}
	}

}
