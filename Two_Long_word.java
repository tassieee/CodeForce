import java.util.Scanner;
public class Two_Long_word {
public static void main(String[]args) {
	Scanner scnr=new Scanner(System.in);
	
	int count=0;
	//System.out.println("How many line you want?");
	int n=scnr.nextInt();
	String[]word1=new String[n+1];
	for(int i=0;i<n+1;i++)
	{
	word1[i]=scnr.nextLine();
	}
	for(int j=0;j<n+1;j++)
	{
		if(word1[j].length()<10)
		{
		
	System.out.println(word1[j]);
		}
	else 
	
		{
	System.out.print(word1[j].charAt(0));//for the first input
		count=word1[j].length()-2;
		System.out.print(count);
		System.out.print(word1[j].charAt(word1[j].length()-1));
		
		}
		System.out.println();
	}
		 
	
}
}




