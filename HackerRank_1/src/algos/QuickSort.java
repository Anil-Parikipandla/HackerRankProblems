package algos;

import java.util.Arrays;

public class QuickSort {
	int[] array;
	int lengthOfArray;
	public static void main(String[] args) {
		int[] testArray = {5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5,2, 7, 9, 24, 34, 52, 6, -1, -12, -250, -34};
		QuickSort sort = new QuickSort();
		sort.quicksort(testArray);
		System.out.println(Arrays.toString(testArray));
		
	}
	
	public void quicksort(int[] array){
		if(array == null || array.length == 0){
			return;
		}
		this.array = array;
		this.lengthOfArray = array.length;
		quicksort(array, 0, lengthOfArray-1);
	}
	
	private void quicksort(int[] array,int left,int right){
		int i =left;
		int j = right;
		int pivot = array[(left+right)/2];
		while(i<=j){
			while(array[i] < pivot){
				i++;
			}
			while(array[j] > pivot){
				j--;
			}
			if(i<=j){
				swap(array, i,j);
				i++;
				j--;
			}
		}
		if(left < j){
			quicksort(array, left, j);
		}
		if(i < right){
			quicksort(array, i, right);
		}
	}
	
	private void swap(int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
