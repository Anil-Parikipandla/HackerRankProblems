package algos;

public class CountingSort {

	public static int[] countingSort(int[] inputArray){
		
		//Getting the maximum value in the given array
		int maxValue = inputArray[0];
		for(int i = 0;i<inputArray.length;i++){
			if(maxValue <= inputArray[i]){
				maxValue = inputArray[i];
			}
		}
		
		//creating a new array for count
		int numCounts[] = new int[maxValue+1];
		
		//populating counts in the array
		for(int num: inputArray){
			numCounts[num]++;
		}
		
		//create and populate the final sorted array
		int[] sortedArray = new int[inputArray.length];
		int currentSortedIndex = 0;
		
		//for each number in numCounts
		for(int num = 0; num < numCounts.length;num++){
			int count = numCounts[num];
			
			//for the number of time the number occurs
			for(int i = 0; i < count; i++){
				// Add the number to sorted array
				sortedArray[currentSortedIndex] = num;
				currentSortedIndex++;
			}
		}
		return sortedArray;
	}
}
