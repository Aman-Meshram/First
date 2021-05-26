import java.util.Scanner;

		public class Amstrong14 {
								public static void main(String[] args) {
									int no,sum=0,cop;
									System.out.println("enter a no");
									Scanner obj=new Scanner(System.in);
									no=obj.nextInt();
									cop=no;
									while(no!=0)
									{
										int mod=no%10;
										int rem=no/10;
										sum=sum+mod*mod*mod;
										no=rem;
										
									}
									if(cop==sum)
										System.out.println("entered no is amstrong");
									else
										System.out.println("entered no is not amstrong");
							
							}

}
