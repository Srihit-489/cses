import java.lang.*;
import java.util.*;

class CreateStrings{
	public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
		  PriorityQueue<String> pq = new PriorityQueue<String>();
		  String str = scanner.next();
		  getStrings(str,new StringBuilder(),pq);
		  System.out.println(pq.size());
		  while(pq.size() != 0){
				String s = pq.remove();
				System.out.println(s);
		  }
	}

	public static void getStrings(String str,StringBuilder cur,PriorityQueue<String> pq){
		  if(str.length() == 0){
				if(!pq.contains(cur.toString()))
					pq.add(cur.toString());
				return;
		  }
		  for(int i=0;i<str.length();i++){
			    StringBuilder newstring = new StringBuilder(cur);
				newstring.append(str.charAt(i));
				getStrings(str.substring(0,i)+str.substring(i+1,str.length()),newstring,pq);
		  }
	}

}
