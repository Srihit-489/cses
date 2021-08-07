import java.lang.*;
import java.util.*;

public class q3{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			String str = scanner.next();
			int start = 0;
			int end = 1;
			int count = 1;
			int max = 1;
			for(;end<str.length();end++){
				  if(str.charAt(start) == str.charAt(end)){
						count++;
						max = Math.max(count,max);
				  }else{
					  count = 1;
					  start = end;
				  }	  
			}
			System.out.println(max);
	  }
}
