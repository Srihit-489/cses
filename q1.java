import java.lang.*;
import java.util.*;

public class q1{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			long n = scanner.nextLong();
			System.out.print(n+" ");
			while(n != 1){
				  if(n%2 == 1){
						n = 3*n+1;
						System.out.print(n+" ");
				  }else{
						n = n/2;
						System.out.print(n+" ");
				  }
			}
			System.out.println();

	  }
}
