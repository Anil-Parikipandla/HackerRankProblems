package WarmUp;

public class CallTheMethod {

	public static void main(String[] args) {
		//Initialize the classes
		MiniMaxSum minimaxObj = new MiniMaxSum();
		BirthDayCakeCandles bdayCakeCandlesobj = new BirthDayCakeCandles();
		
		
		
		//MiniMaxSum
		//long[] arr = Misc.readLongIntegersToArray(5);
		//minimaxObj.calculateMiniMaxSum(arr);
		
		//Birthday Cake candles
		int NumberOfcandles = Misc.readInteger();
		int[] candleArray = Misc.readIntegersToArray(NumberOfcandles);
		
		bdayCakeCandlesobj.NoOfCandlesBlown(NumberOfcandles, candleArray);
		
	}

}
