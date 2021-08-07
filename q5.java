import java.lang.*;
import java.util.*;

class q5{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			if(n == 1){
				  System.out.println("1");
				  return;
			}
			if(n <= 3){
				  System.out.println("NO SOLUTION");
				  return;
			}
			if(n%2 == 0){
				for(int i=2;i<= n;i+=2){
					  System.out.print(i+" ");
				}
				for(int i=1;i< n;i+=2){
			    	  System.out.print(i+" ");
		    	}
			}else{
				 for(int i=n-1;i>0;i-=2)
					 System.out.print(i+" ");
				 for(int i=n;i>0;i-=2)
					 System.out.print(i+" ");
			}
			System.out.println();
			scanner.close();
	  }
}
