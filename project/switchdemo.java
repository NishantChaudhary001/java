package project;
import java.util.Scanner;
public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
switch(n)
{
case 1:System.out.println("monday");
break;
case 2:System.out.println("tuesday");
break;
case 3:System.out.println("wedesday");
break;
case 4:System.out.println("thursday");
break;
case 5:System.out.println("friday");
break;
case 6:System.out.println("saturday");
break;
case 7:System.out.println("sunday");
break;
default:System.out.println("wrong");
}

	}

}
