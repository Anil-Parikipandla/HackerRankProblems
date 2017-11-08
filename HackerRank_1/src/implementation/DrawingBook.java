package implementation;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook {

	static int solve(int n, int p){
		int noOfTurnsFromBack = 0;
		int noOfTurnsFromFront = (p%2==0)?p/2:(p-1)/2;
		if(n%2==0){
			noOfTurnsFromBack = (p%2==0)?(n-p)/2:(n-p)+1/2;
		}else{
			noOfTurnsFromBack = (p%2==0)?(n-p-1)/2 :(n-p)/2;
		}
		return (noOfTurnsFromFront < noOfTurnsFromBack)?noOfTurnsFromFront:noOfTurnsFromBack;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int result = solve(n, p);
		System.out.println(result);
	}
}

