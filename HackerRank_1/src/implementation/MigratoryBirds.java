package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] arr) {
/*    	int[] counterArray = new int[ar.length];
    	for(int i = 0; i < ar.length; i++){
    		arr[(arr[i]%k)] += k;
    	}
    	
    	
    	return n;*/
    	int k =n;
        for (int i = 0; i< n; i++){
//            arr[(arr[i]%k)] += k;
        	 int x = arr[i]%k;
        arr[x] = arr[x] +k;
        }
        // Find index of the maximum repeating element
        int max = arr[0], result = 0;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                result = i;
            }
        }
 
        /* Uncomment this code to get the original array back
        for (int i = 0; i< n; i++)
          arr[i] = arr[i]%k; */
 
        // Return index of the maximum element
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}

/*package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
    	Arrays.sort(ar);
    	int currentBirdCount = 1;
    	int highestCount = 0;
    	int currentBird = ar[0];
    	int mostfrequentBird = ar[0]; 
    	for(int i = 0; i < ar.length-1; i++){
    		currentBird = ar[i];
    		if(ar[i]==ar[i+1]){
    			currentBirdCount++;
    			if(currentBirdCount > highestCount){
    				highestCount = currentBirdCount;
    				mostfrequentBird = currentBird;
    			}
    		} else{
    			currentBirdCount = 1;
    		}
    	}
		return mostfrequentBird;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
*/
