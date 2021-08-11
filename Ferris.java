import java.util.*;
import java.lang.*;

class Ferris{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
          int n = scanner.nextInt();
		  int x = scanner.nextInt();
		  int[] child = new int[n];
		  for(int i=0;i<n;i++)
			  child[i] = scanner.nextInt();
		  Arrays.sort(child);
		  int count = 0;
		  for(int i=0,j=n-1; i < j;){
				while(i < j && child[i]+child[j] > x)
					--j;
				if(i >= j)
					break;
				count++;
				++i;
				--j;
		  }
          System.out.println(n - count);
	  }

}
