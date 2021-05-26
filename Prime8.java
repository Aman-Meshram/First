import java.util.Scanner;

public class Prime8 {

	public static void main(String[] args) {
											int a;
											boolean flag=true;
											System.out.println("enter a no u want to check");
											Scanner obj=new Scanner(System.in);
											a=obj.nextInt();
											for(int i=2;i<a;i++)
											{
												if(a%i==0)
												{
													flag=false;
													break;
												}
											}
											if(flag==false)
											{
												System.out.println("entered no is not prime");
											}
											else
												System.out.println("entered no is prime");
	}

}
