package implementation;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class DayOfTheProgrammer {

	static String solve(int year){
		String date = "";
/*		if(year <= 2700 && year >= 1700){
			if(year != 1918){
				date = (DayOfTheProgrammer.isLeapYear(year)?"12.09.":"13.09.")+year;
				//System.out.println(date);
			} else {
				date = "26.09.1918";
			}
		}
		return date;*/
		
		if(year <= 2700 && year > 1918){
			if((year%400 == 0) || (year%4==0 && year%100!=0)){
				date = "12.09."+year;
			}else{
				date = "13.09."+year;
			}
		} else if(year >= 1700 && year < 1918){
			if(year%4==0){
				date = "12.09."+year;
			}else{
				date = "13.09."+year;
			}
		} else{
			date = "26.09.1918";
		}
		
		return date;
	}

	public static boolean isLeapYear(int year){
		boolean leapYear = false;
		if(year >= 1700 && year < 1918){
			if(year%4==0){
				leapYear = true;
			}
		} else if(year > 1918 && year <= 2700){
			if((year%400 == 0) || (year%4==0 && year%100!=0)){
				leapYear = true;
			}
		}
		return leapYear;
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String result = solve(year);
		System.out.println(result);
	}
}
