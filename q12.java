import java.lang.*;
import java.util.*;

class q12{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			String str = scanner.next();
			StringBuilder sb = new StringBuilder();
			int[] ch = new int[26];
			for(int i=0;i<str.length();i++){
				  ++ch[str.charAt(i) - 'A'];
			}
			int count = 0;
			for(int i=0;i<26;i++){
				  if(ch[i]%2 == 1)
					  count++;
			}
			if(count > 1){
				  System.out.println("NO SOLUTION");
				  return;
			}
			
			int oddindex = -1;
			int i = 0;
			for(i=0;i<26;i++){
				  if(ch[i]%2 == 0){
						for(int j=0;j<ch[i]/2;j++){
							  sb.append((char)(i+'A'));
							  System.out.print((char)(i+'A'));
						}
				  }else{
						oddindex = i;
				  }
			}

			if(oddindex != -1)
				for(int k=0;k<ch[oddindex];k++)
				  System.out.print((char)(oddindex+'A'));
			System.out.println(sb.reverse());
			
	  }
}
