import java.util.*;
import java.lang.*;

class q7{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int t = scanner.nextInt();
			for(int i=1;i<=t;i++){
				  long sqrs = i*i;
				  long total = (sqrs * (sqrs-1))/2;
				  if(i <= 2){
					  System.out.println(total);
					  continue;
				  }else{
						total-=4*(i-1)*(i-2);
						System.out.println(total);
				  }
			}
	  }
}
