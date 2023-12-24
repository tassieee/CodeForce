import java.util.Scanner;
public class Elephant {
	
public void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the step : ");
	 int s=sc.nextInt();
	 int steps=calculation(s);
	 System.out.println(steps);
	 
	 
	 
}
private static int calculation(int s) {
	int step=s/5;
	if(s%5!=0) {
		step++;
	}
	
	return s;	
}
}
