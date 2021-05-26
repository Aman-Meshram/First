import java.io.*;
public class Compound{
   public static void main(String args[]){
      double princ = 200000; 
    		int  rt = 6; 
    		 int tm = 3;
      double comp_int = princ *(Math.pow((1 + rt / 100), tm));
      System.out.println("The compound interest for the given principle amount  "+200000+ "  rate  "+6 + "  time  "+3+" "+          comp_int);
   }
}
