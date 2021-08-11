import java.lang.*;
import java.util.*;

class gray{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			ArrayList<StringBuilder> mylist = new ArrayList<StringBuilder>();
			StringBuilder sb1 = new StringBuilder();
			sb1.append('0');
			StringBuilder sb2 = new StringBuilder();
			sb2.append('1');
			mylist.add(sb1);
			mylist.add(sb2);
			if(n == 1){
				  for(StringBuilder str : mylist)
					  System.out.println(str.toString());
				  return;
			}
			makelist(mylist,n-1);
			for(StringBuilder sb : mylist)
				System.out.println(sb.toString());
	  }

	  public static void makelist(List<StringBuilder> mylist,int k){
			if(k == 0)
				return;
            List<StringBuilder> newlist = new ArrayList<StringBuilder>();
		    for(StringBuilder sb : mylist)
				newlist.add(new StringBuilder(sb));
			Collections.reverse(newlist);
			for(StringBuilder sb : mylist){
				 sb.insert(0,'0');
			}
			for(StringBuilder sb : newlist){
				  sb.insert(0,'1');
				  mylist.add(sb);
			}
			makelist(mylist,k-1);
	  }
}
