import java.util.Scanner;
public class Team {

	public static void main(String[] args) {
 var sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        int count = 0;
	        while(t-->0)
	        {
	            int petya = sc.nextInt();
	            int vasya = sc.nextInt();
	            int tonya = sc.nextInt();
	            if(petya+vasya+tonya >=2)
	                ++count;
	        }
	        System.out.println(count);
	    }
	}
	

