import java.util.Scanner;
public class The_las_2_digits {

	public static void main(String[] args) {
		int y=0;
		int i=0;
		 String z = "";
		var sc=new Scanner(System.in);
		int a=sc.nextInt(10000-1)+2;
		int b=sc.nextInt(10000-1)+2;
		int c=sc.nextInt(1000-1)+2;
		int d=sc.nextInt(10000-1)+2;
		
		int e=a*b*c*d;
		 while( i < 2)
	        {
	            y = e % 10;
	            z = y + "" +z;
	            e = e / 10;
	            i++;
	        }
		 System.out.println(e);
	}

}
		 