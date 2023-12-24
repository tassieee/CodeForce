import java.util.Scanner;
public class Welcome_for_you_with_Conditions {

	public static void main(String[] args) {
	var sc=new Scanner(System.in);
	//for A
	int a=sc.nextInt();
	//for B
	int b=sc.nextInt();
	if(a>b || a==b)
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
	
	}

}
