import java.util.Scanner;

	public class Evenoddsum11 {
				public static void main(String[] args) {
												int a,eans=0,oans=0;
											System.out.println("enter a no ");
											Scanner obj=new Scanner(System.in);
											a=obj.nextInt();
											
											for(int i=1;i<=a;i++)
											{
												if(i%2== 0)
												{
													eans=eans+i;
												}
												else
												{
													oans=oans+i;
												}
											}
											System.out.println("sum of even no's from 0 to "+a+"="+eans);
											System.out.println("sum of odd no's from 0 to "+a+"="+oans);
										}
				

}
