import java.lang.*;
import java.util.*;

class q11{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int t = scanner.nextInt();
			while(t != 0){
				  function();
				  t--;
			}
	  }

	  public static void function(){
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			System.out.println((a+b)%3 == 0 && 2*a > b && 2*b > a ?"YES":"NO");
			return;


	  }
}
