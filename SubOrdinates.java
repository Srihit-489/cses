import java.util.*;
import java.lang.*;
import java.io.*;

public class ds {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		 int n = scanner.nextInt();
		 scanner.nextLine();
		 int[] arr = new int[n+1];
		 HashMap<Integer,List<Integer>> myhash = new HashMap<Integer,List<Integer>>();
		 for(int i = 1;i<=n;i++){
			 myhash.put(i,new ArrayList<Integer>());
		 }
		 String[] in = scanner.nextLine().split(" ");
		 for(int i =2;i<=n;i++){ 
			 int key = Integer.parseInt(in[i-2]);
			// myhash.get(i).add(key);
			 myhash.get(key).add(i);
		 }
		 
		 arr[1] = getsub(myhash,arr,1);
		 StringBuilder sb = new StringBuilder();
		 sb.append(arr[1]-1);
		 for(int i = 2;i<=n;i++){
			 int num = arr[i] - 1;
			 sb.append(" ");
			 sb.append(num);
		 }
		 System.out.println(sb);

	}
	
	public static int getsub(HashMap<Integer,List<Integer>> myhash,int[] arr,int cur){
		if(myhash.get(cur).size() == 0){
			arr[cur] = 1;
			return arr[cur];
		}else{
			for(int num : myhash.get(cur)){
				arr[cur] += getsub(myhash,arr,num);
			}
			arr[cur]++;
			return arr[cur];
		}
	}
	
	
}
