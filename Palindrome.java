import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]){  
		  int r,sum=0,temp;    
		  System.out.println("emter the a no ");
		  Scanner obj=new Scanner(System.in);
		  int n=obj.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  


