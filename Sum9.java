import java.util.Scanner;

public class Sum9 {
	
		public static void main(String[] args) {
											int a,ans=0;
										System.out.println("enter a no ");
										Scanner obj=new Scanner(System.in);
										a=obj.nextInt();
										
										for(int i=1;i<=a;i++)
										{
											 ans=ans+i;
										}
										System.out.println("sum of no's from 0 to "+a+"="+ans);
		}

	}

