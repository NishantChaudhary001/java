package project;
import java.util.Scanner;
public class electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int unit = sc.nextInt();
double total;
if(unit <=50)
{
	total= .50 *unit;
	System.out.println("Total is:"+total);
}
else if(50<150)
{
	total= .75 *unit;
	System.out.println("Total is:"+total);
}
else if(150<250)
{
	total= 1.20 *unit;
	System.out.println("Total is:"+total);
}
else
{
	total= 1.50 *unit;
	System.out.println("total is:"+total);
}
	}

}
