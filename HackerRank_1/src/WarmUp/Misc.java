package WarmUp;
import java.util.Scanner;

public class Misc {

	public static int[] readIntegersToArray(int sizeOfArray){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[sizeOfArray];
        for(int arr_i=0; arr_i < sizeOfArray; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        in.close();
        return arr;
	}
	
	public static long[] readLongIntegersToArray(int sizeOfArray){
        Scanner in = new Scanner(System.in);
        long[] arr = new long[sizeOfArray];
        for(int arr_i=0; arr_i < sizeOfArray; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        in.close();
        return arr;
	}
	
	public static int readInteger(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        return n;
	}
	
	public static long[] sortLongNumbersOfArray(long[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					arr[j] = (arr[i]+arr[j])-(arr[i]=arr[j]);
				}
			}
		}
		System.out.println("Sorted Array is: "+arr);
		return arr;
	}
	
	public static int[] sortNumbersOfArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					arr[j] = (arr[i]+arr[j])-(arr[i]=arr[j]);
				}
			}
		}
		System.out.println("Sorted Array is: "+arr);
		return arr;
	}
	
	
	
}
