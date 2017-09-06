package implementation;

import java.util.Scanner;

public class BreakingTheRecords {
	static int[] getRecord(int[] s){
		int max = s[0], min = s[0];
		int maxCount = 0, minCount = 0;
      for(int i =0;i<s.length;i++){
    	  if(s[i] < min){
    		  min = s[i];
    		  minCount++;
    	  } else if(s[i]>max){
    		  max = s[i];
    		  maxCount++;
    	  }
      }
      int[] x = {maxCount,minCount} ;
      return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}

