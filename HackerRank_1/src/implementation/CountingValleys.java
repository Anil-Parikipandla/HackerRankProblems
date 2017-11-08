package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingValleys {

	static int CountNumberOfValleys(int NoOfSteps, String stepDetails){
		int NoOfValleys = 0;
		int plot = 0;
		for(char step : stepDetails.toCharArray()){
			
			if(step == 'U'){
				plot += 1;
			} else if(step == 'D'){
				plot -= 1;
			}
			if(plot==0 && step == 'U'){
				NoOfValleys++;
			}
		}
		return NoOfValleys;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String stepDetails = sc.nextLine();
		int NoOfValleys = CountNumberOfValleys(n,stepDetails);
		System.out.println(NoOfValleys);
	}
}