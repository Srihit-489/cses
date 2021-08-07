import java.lang.*;
import java.util.*;


class q8{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			long  n = scanner.nextLong();
			long val = 0;
			if(n%2 == 0){
		    	val = 	(n/2)%2*((n+1)%2);
			}else{
				  val = (((n+1)/2)%2)*(n%2);
			}
			if(val  == 1){
				  System.out.println("NO");
				  return;
			}
			List<Integer> mylist1 = new ArrayList<Integer>();
			List<Integer> mylist2 = new ArrayList<Integer>();
			int runner = 0;
			if(n%4 == 3){
				  mylist1.add(1);
				  mylist1.add(2);
				  mylist2.add(3);
				  runner = 3;
			}
			
			while(runner < n){
						mylist2.add(runner+1);
						mylist2.add(runner+4);
						mylist1.add(runner+2);
						mylist1.add(runner+3);
						runner = runner + 4;
			}
			System.out.println("YES");
			System.out.println(mylist2.size());
			for(int i : mylist2)
				System.out.print(i+" ");
			System.out.println();
			System.out.println(mylist1.size());
			for(int i: mylist1)
				System.out.print(i+" ");
            System.out.println();
	  }
}
