package WarmUp;

public class MiniMaxSum {

	public void calculateMiniMaxSum(long[] arr){
		long MinSum = 0, MaxSum = 0;

		Misc.sortLongNumbersOfArray(arr);
		for(int i=0;i<4;i++){
			MinSum = MinSum + arr[i];
			MaxSum = MaxSum + arr[i+1];
		}

		System.out.println(MinSum+" "+MaxSum);
	}
	

}
