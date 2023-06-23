package project;

public class hollorectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n= 4;
//for(int i=1;i<=n;i++) {
	//for(int j=1;j<=i;j++) {
		//System.out.print("*");
	//}
//	System.out.println();
//}
//for(int i=n; i>=1; i--) {
	//for(int j=1; j<=i; j++) {
		//System.out.print("*");
	//}
	//System.out.println();
//}
//for(int i=1; i<=n; i++);{
	//for space---->
	//for(int j=1; j<=n-1; j++);{ 
	//System.out.print(" ");
	//}=
  //for stars---->
	//for(int j=1; j<=i; j++){
	//System.out.print("*");
//}
	//System.out.println();
//}
for(int i=1; i<=n; i++) {
	for(int j=1; j<=n-i+1; j++) {
		System.out.print(j);
	}
	System.out.println();
}
	}
}
