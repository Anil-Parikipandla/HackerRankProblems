package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
    	int pairs = 0;
        for(int i = 0; i <= n; i++){
            for(int j = i+1;j < ar.length; j++){
            	if(ar[i]==ar[j] && (ar[i] != 0 && ar[j] != 0)){
            		pairs+=1;
            		ar[j]=0;
            		break;
            	}
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
