import java.util.*;
import java.lang.*;

public class q2{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			 long n = scanner.nextLong();
			 long sum = 0;
			 long runner = n;
			 while(n != 1){
				  long val = scanner.nextLong();
				  sum = sum + val;
				  n--;
			 }
			 n = runner;
			 long  actual = n*(n+1)/2;
			 actual = actual - sum;
			 System.out.println(actual);
			 scanner.close();
	  }
}
