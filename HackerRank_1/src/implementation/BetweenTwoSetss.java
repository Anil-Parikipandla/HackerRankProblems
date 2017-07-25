import java.util.Scanner;

public class BetweenTwoSetss {
	    static int getTotalX(int[] a, int[] b){
	        int counter = 0;
	        for(int i = a[a.length-1];i<=b[0];i++){
	        	boolean status = true;
	            for(int x=0;x<a.length;x++){
	                if(i%a[x]==0){
	                	status = status&&true;
	                } else {
	                	status = status&&false;
	                }
	            }
	            for(int y=0;y<b.length;y++){
	                if(b[y]%i==0){
	                	status = status&&true;
	                }else{
	                	status = status&&false;
	                }
	                
	            }
	            if(status){
	            	counter++;
	            }
	    }
	        return counter;
	   }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int[] b = new int[m];
	        for(int b_i=0; b_i < m; b_i++){
	            b[b_i] = in.nextInt();
	        }
	        int total = getTotalX(a, b);
	        System.out.println(total);
	    }
	}

