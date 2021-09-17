import java.lang.*;
import java.util.*;

public class Prac{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
         int n = scanner.nextInt();
         int[] data = new int[n+1];
    	data[0] = 0;
    	if(n < 10){
			System.out.println("1");
			return;
		}
		for(int i = 1;i<10;i++){
			data[i] = 1;
		}
		for(int i = 10;i<=n;i++){
			HashSet<Integer> myhash = getnums(i);
			int min = Integer.MAX_VALUE;
			for(int num : myhash){
				if(num != 0)
				min = Math.min(min,1+data[i-num]);
			}
			data[i] = min;
		}
		System.out.println(data[n]);
	}
	
	public static HashSet<Integer> getnums(int n){
		HashSet<Integer> ans = new HashSet<Integer>();
		while(n > 0){
			int val = n%10;
			ans.add(val);
			n/=10;
		}
		return ans;
	}
	
	
	
}
