import java.util.Scanner;

class Factorial{
 public static void main(String args[]){
									  int i,fact=1;
									  System.out.println("enter a no");
									  Scanner obj=new Scanner(System.in);
									  int number=obj.nextInt();
									  for(i=number;i>0;i--){  
									      fact=fact*i;  
									  }  
									  System.out.println("Factorial of "+number+" is: "+fact);  
									 }
									}


	


