package test.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int data[] = {3,1,2,4,5,6,7,8,9,0};
		int low = 0;
		int high = data.length -1;
		quickSort(data, low, high);
		System.out.println(Arrays.toString(data));
	}
	
	public static void quickSort(int[] data, int low, int high) {
		if(low < high) {
			System.out.println(low + "-" + high + "" +Arrays.toString(data));
			int middle = getMiddle(data, low, high);
			quickSort(data, low, middle - 1);
			quickSort(data, middle + 1, high);
		}
	}
	
	public static int getMiddle(int[] data, int low, int high) {
		int tmp = data[low];
		while(low < high) {
			while(low < high && data[high] > tmp) {
				high--;
			}
			data[low] = data[high];
			while(low < high && data[low] < tmp) {
				low++;
			}
			data[high] = data[low];
		}
		data[low] = tmp;
		return low;
	}

}
