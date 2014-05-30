package test.sort;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] data = {49, 38, 65, 97, 76, 13, 27, 49};
		System.out.println(Arrays.toString(data));
		sort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public static void sort(int[] data) {
		int length = data.length;
		for(int i = (length -1) / 2; i >= 0; i--) {
			adjust(data, i, length);
		}
		for(int count = length - 1; count > 0; count--) {
			swap(data, 0, count);
			adjust(data, 0, count);
		}
	}
	
	public static void adjust(int[] data, int parentIdx, int length) {
		for(int j = (parentIdx + 1) * 2 - 1; j < length; j = (j + 1) * 2 - 1) {
			if(j + 1 <= length - 1 && data[j] > data[j+1]) {
				j++;
			}
			if(data[parentIdx] <= data[j]) {
				break;
			}
			swap(data, parentIdx, j);
			parentIdx = j;
		}
	}
	
   private static void swap(int[] a,int i,int j){    
	   int temp = a[i];
        a[i] = a[j];    
        a[j] = temp;    
    }
   
}
