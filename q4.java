import java.lang.*;
import java.util.*;

class q4{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			long curmax = 0;
			long count = 0;
			while(n != 0){
			    	n--;
				  long val = scanner.nextLong();
				  if(val >= curmax){
						curmax = val;
						continue;
				  }else{
						count += curmax-val;
						continue;
				  }
			}
			System.out.println(count);
	  }
}
