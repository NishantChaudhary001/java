package project;
import java.util.Scanner;
public class compoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
double amount;
double principal;
double rate;
double time;
System.out.println("enter principal amount: ");
 principal = scanner.nextDouble();
System.out.println("enter rate :");
 rate = scanner.nextDouble();
System.out.println("enter time:");
time = scanner.nextDouble();
//amount =principal * (1  + rate /100) ^ time
amount =principal * Math.pow((1+ rate / 100),  time);
System.out.println("the compound interest is:"+ amount);
	}

}
