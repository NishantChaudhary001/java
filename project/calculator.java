package project;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int a= sc.nextInt();
int b=sc.nextInt();
System.out.println("+,-,*,/");
String c=sc.next();
switch(c)
{
case "+":System.out.println("add"+(a+b));
break;
case "-":System.out.println("sub"+(a-b));
break;case "*":System.out.println("mul"+(a*b));
break;case "/":System.out.println("div"+(a/b));
break;
default:System.out.println("wrong ");
}
}
}
