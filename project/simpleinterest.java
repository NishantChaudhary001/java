package project;
import java.util.Scanner;
public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
double principal;
double rate;
double time;
double result;
System.out.println("enter the principal:");
 principal=scanner.nextDouble();
 System.out.println("enter the time:");
 time=scanner.nextDouble();
 System.out.println("enter the rate:");
 rate=scanner.nextDouble();
 result=((principal* time* rate)/100);
System.out.println("simpleinterest:"+result);
	}

}
