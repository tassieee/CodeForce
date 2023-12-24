import java.util.Scanner;
public class Road_to_ACPC {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		int n=0;
		int x=0;
		while(n>=10 || n<=Math.pow(10, 18)) {
			n=sc.nextInt();
			x=n/10;
	
		System.out.print(x);
	}

}
}
