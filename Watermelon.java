import java.util.Scanner;
public class Watermelon {

	public static void main(String[] args) {
	var s=new Scanner(System.in);
	int n=s.nextInt();
	if(n==2) 
	{
		System.out.print("NO");
	}
	else if(n%2==0) 
	{
		System.out.print("YES");	
	}
	else
	{
		System.out.print("NO");
	}
	}

}
