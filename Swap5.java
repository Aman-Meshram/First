import java.util.*;
public class Swap5 {

	public static void main(String[] args) {
									int a,b,temp;
									System.out.println("enter values of a and b");
									Scanner obj=new Scanner(System.in);
									a=obj.nextInt();
									b=obj.nextInt();
									temp=a;
									a=b;
									b=temp;
									System.out.println("values of a and b after swap "+"a="+a+"  "+"b="+b);
	}

}
