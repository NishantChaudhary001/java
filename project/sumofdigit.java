package project;
import java.util.Scanner;
public class sumofdigit {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum = 0;
int r;
while(n>0)
{
	r=n%10;
	sum=sum+r;
	n=n/10;
}
System.out.println("the sum of the digit is :"+sum);
sc.close();
	}

}
