package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {
//
    static int bonAppetit(int n, int k, int b, int[] ar) {
    	int bActual = 0;
    	for(int i = 0; i < ar.length; i++){
    		bActual = bActual + (i == k ? 0:ar[i]);
    	}
    	if(b==bActual/2){
    		System.out.println("Bon Appetit");
    	}
    	return b-(bActual/2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        System.out.println(result);
    }
}
