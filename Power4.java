import java.util.*;
public class Power4 {

	public static void main(String[] args) {
										int a,b,ans=1;
									System.out.println("enter a no");
									Scanner obj=new Scanner(System.in);
									a=obj.nextInt();
									System.out.println("enter what power u want to find");
									b=obj.nextInt();
									for(int i=0;i<b;i++)
									{
										 ans=ans*a;
									}
									System.out.println("power= "+ans);
	}

}
