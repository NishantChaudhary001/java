package project;
import java.util.Scanner;
public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int radius = sc.nextInt();
int diameter = 2*radius;
double circumference = 2*(3.14)*(radius);
double area = (3.14)*(radius^2);
System.out.println("radius of circle is:"+radius);
System.out.println("diameter of circle is:"+diameter);
System.out.println("circumference of circle is:"+circumference);
System.out.println("area of circle is:"+area);

	}

}
