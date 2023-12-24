import java.util.Scanner;
public class BoyOrGirl {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	//System.out.println("Enter a user name :");
	String name=input.nextLine().toLowerCase();
	
	if(name.length()%2==0){
		System.out.println("CHAT WITH HER!");
	}
	else {
		System.out.println("IGNORE HIM");
	}
	
	
	}

}
