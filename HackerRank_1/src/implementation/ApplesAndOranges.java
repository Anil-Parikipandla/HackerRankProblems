package implementation;

import java.util.Scanner;

public class ApplesAndOranges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        int numberOfApples = 0;
        int numberOfOranges = 0;
        for(int appleDistance: apple){
        	if((s<=a+appleDistance)&&(a+appleDistance<=t)){
        		numberOfApples = numberOfApples+1;
        	}
        }
        
        for(int orangelDistance: orange){
        	if((s<=b+orangelDistance)&&(b+orangelDistance<=t)){
        		numberOfOranges = numberOfOranges+1;
        	}
        }
        
        System.out.println(numberOfApples+"\n"+numberOfOranges);
    }
}
