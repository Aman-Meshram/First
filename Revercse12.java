import java.util.*;
public class Revercse12 {

	public static void main(String[] args) {
									int no,rev=0;
									System.out.println("enter a no");
									Scanner obj=new Scanner(System.in);
									no=obj.nextInt();
									while(no!=0)
									{
										int mod=no%10;
										int rem=no/10;
										rev=rev*10+mod;
										no=rem;
										
									}
									System.out.println("rev of no is="+rev);
								

	}

}
