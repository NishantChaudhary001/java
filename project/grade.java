package project;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int m = s.nextInt();
if(m>=90)
{
	System.out.println("The grade is A");
}
else if(m>80 && m<=90)
{
	System.out.println("The grade is B");
}
else if(m>70 && m<=80)
{ 
	System.out.println("The grade is C");
}
else
{
	System.out.println("fail");
}
	}

}