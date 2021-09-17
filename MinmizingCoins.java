import java.lang.*;
import java.util.*;

public class Prac{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.nextLine();
		
		List<Integer> avail = new ArrayList<Integer>();
		String[] input = scanner.nextLine().split(" ");
		int[] data =  new int[k+1];
		for(String num : input){
			int val = Integer.parseInt(num);
			avail.add(val);
			if(val <= k)
			   data[val] = 1;
		}
		
		for(int i = 1;i<=k;i++){
			int min = Integer.MAX_VALUE;
			if(data[i] == 1)
			   continue;
			for(int num : avail){
				if(num > i || data[i-num] == -1)
				   continue;
				min = Math.min(min,1+data[i-num]);
			}
			min = min == Integer.MAX_VALUE?-1:min;
			data[i] = min; 
		}
		
		System.out.println(data[k]);
		      
		
		
		
	}
}
