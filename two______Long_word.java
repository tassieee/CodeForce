import java.util.Scanner;
public class two______Long_word {

	public static void main(String[] args) {
		var s=new Scanner(System.in);
	//	System.out.println("How Many Line Do you Want?");
		int n=s.nextInt();
		String [] word=new String[n+1];
        for(int i=0;i<n+1;i++)
		{
			 word[i]=s.nextLine();
		}
		for(int j=0;j<n+1;j++) {
			
			if(word[j].length()<=10)
			{
				System.out.print(word[j]);
			}
			else
			{
				System.out.print(word[j].charAt(0));
				System.out.print(word[j].length()-2);
				System.out.print(word[j].charAt(word[j].length()-1));
			}
			System.out.println();
		}
	}
	
}

