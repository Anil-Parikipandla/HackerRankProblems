package strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
/*		int alteredCount = 0;
		for(int i = 0; i < S.length(); i=i+3){
			String str = S.substring(i, i+3);
			if(str.charAt(0)!='S'){
				alteredCount++;
			} if(str.charAt(1)!='O'){
				alteredCount++;
			} if(str.charAt(2)!='S'){
				alteredCount++;
			}
		}
		System.out.println(alteredCount);*/
		
		
		String sos = "SOS";
		int alteredCount = 0;
		for(int i = 0; i < S.length(); i++){
			if(S.charAt(i)!=(sos.charAt(i%3))){
				alteredCount++;
			}
		}
		System.out.println(alteredCount);
	}
}

