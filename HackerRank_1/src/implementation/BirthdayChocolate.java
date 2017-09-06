package implementation;

import java.util.Scanner;

public class BirthdayChocolate {
	 static int solve(int n, int[] s, int d, int m){
		 int NoOfWays = 0;
		 int conSum;
		 if(s.length==m){
			 conSum = 0;
			 for(int i=0;i<s.length;i++){
				 conSum = conSum + s[i];
			 }
			 return conSum==d?1:0;
		 }  else {
	        for(int i=0;i<=s.length-m;i++){
	        	conSum = 0;
	        	int k = i;
	        	for(int j=0;j<m;j++){
	        		conSum = conSum + s[k];
	        		k++;
	        		}
	        	if(conSum==d){
	        		NoOfWays++;
	        	}
	        }
	        return NoOfWays;
	    }
	 }
	 

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] s = new int[n];
	        for(int s_i=0; s_i < n; s_i++){
	            s[s_i] = in.nextInt();
	        }
	        int d = in.nextInt();
	        int m = in.nextInt();
	        int result = solve(n, s, d, m);
	        System.out.println(result);
	    }
}
