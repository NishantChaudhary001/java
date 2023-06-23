package project;
import java.util.Scanner;
public class switchcalculator {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int n =sc.nextInt();
switch(n)
{
case 1:System.out.println("addition" +(a+b));
break;
case 2:System.out.println("sub"+ (a-b));
break;
case 3:System.out.println("mul"+ (a*b));
break;
case 4:System.out.println("div" +(a/b));
break;
case 5:System.out.println("modulo" +(a%b));
break;
}

	}

}
