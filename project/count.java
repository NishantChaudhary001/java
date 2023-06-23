package project;
import java.util.Scanner;
public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int number=5820369;
int noOfDigit=0;
while(number>0)
{
	number=number/10;
	noOfDigit++;
}
System.out.println("the count of the number is "+noOfDigit);
	}

}
