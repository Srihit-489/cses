import java.lang.*;
import java.util.*;

class q10{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			long n = scanner.nextLong();
			long runner = 5;
			long count = 0;
			for(;runner <= n;runner+=5){
				long num = runner;
				  while(num%5 == 0){
						count++;
						num = num/5;
				  }
			}
			System.out.println(count);
	  }
}
