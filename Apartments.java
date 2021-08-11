import java.lang.*;
import java.util.*;

class Apartments{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		    int count = 0;
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int k = scanner.nextInt();
			int[] applicants = new int[n];
			for(int i=0;i<n;i++){
				  applicants[i] = scanner.nextInt();
			}
			Arrays.sort(applicants);
            int[] flats = new int[m];
		    for(int i=0;i<m;i++)
				flats[i] = scanner.nextInt();
            Arrays.sort(flats);
            int i = 0,j=0;
		    while( i != n ){
				while(j<m && flats[j] < applicants[i]-k)
					++j;
				if(j < m && flats[j] <= applicants[i] + k){
					  ++count;
					  ++j;
				}
				i++;
			}

			System.out.println(count);


	  }
}
