import java.util.Scanner;
public class Word_Capitalization {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String [] word =new String[1000];
		int i;
		for(i=0;i<word.length;i++)
		{
			word[i]=sc.nextLine().trim();
			char fstlet=word[i].charAt(0);
			System.out.print(Character.toUpperCase(fstlet));
			System.out.print(word[i].substring(1));
		}
		System.out.println( );
	}

}