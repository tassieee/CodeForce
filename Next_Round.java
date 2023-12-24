import java.util.Scanner;
public class Next_Round {

	public static void main(String[] args) {
	var sc=new Scanner(System.in);
	//Number of participants
	int n=sc.nextInt();
	//Highest Score
	int k=sc.nextInt();
	int per[]=new int[n];
	int count=0;
	for(int i=0;i<n;i++)
	{
		per[i]=sc.nextInt();
		int q=per[k-1];
		if( per[i]>0 && per[i]>=q )
		{
			count++;
		}
	}
	System.out.print(count);
	}
	
}


