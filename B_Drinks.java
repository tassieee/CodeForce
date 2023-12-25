
import java.util.Scanner;


public class B_Drinks {

    
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
        System.out.println("Give the number of Drinks : ");
        int drinks=sc.nextInt();
        double [] volume=new double [drinks];
        double sum=0;
        System.out.println("Give the volume of each drinks: ");
        for(int i=0;i<drinks;i++){
            volume[i]=sc.nextInt();
            sum=sum+volume[i];
        }
        System.out.println("Orange containts :");
        double answer=sum / drinks;
       System.out.printf("%.12f",answer );
    
    
    }
}
