package WarmUp;
import java.util.Scanner;

public class BirthDayCakeCandles {

	public int NoOfCandlesBlown(int NoofCandles, int[] HeightsOfCandles){
		int max = HeightsOfCandles[0];
		int candlesToBeBlown = 0;
		for(int i=0;i<NoofCandles;i++){
			if(HeightsOfCandles[i]>max){
				max = HeightsOfCandles[i];
				candlesToBeBlown = +1;
			}
		}
		//System.out.println(candlesToBeBlown);
		return candlesToBeBlown;
	}
	
	static int birthdayCakeCandles(int n, int[] ar) {
        int max = ar[0];
		int candlesToBeBlown = 0;
		for(int i=0;i<n;i++){
			if(ar[i]>max){
				max = ar[i];
			}
		}
		for(int a: ar){
			if(a == max){
			candlesToBeBlown++;
			}
		}
		
		System.out.println(max);
		return candlesToBeBlown;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
