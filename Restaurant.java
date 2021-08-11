import java.util.*;
import java.lang.*;

class Restaurant{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			HashMap<Integer,Integer> myhash = new HashMap<>();
			int min = Integer.MAX_VALUE;
			int max = 0;
			for(int i=0;i<n;i++){
				  int a = scanner.nextInt();
				  int b = scanner.nextInt();
				  min = Math.min(min,a);
				  max = Math.max(max,b);
				  for(int j=a;j<=b;j++)
					  myhash.put(j,myhash.getOrDefault(j,0)+1);
			}

			int retvalue = 0;
			for(int i = min;i<=max;i++){
				  retvalue = Math.max(retvalue,myhash.get(i));
			}

			System.out.println(retvalue);
	  }
}
