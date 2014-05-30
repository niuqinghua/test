package test.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int data[] = {3,1,2,4,5,6,7,8,9,0};
		System.out.println(Arrays.toString(data));
		for(int i = 0; i < data.length; i++) {
			int minIdx = i;
			for(int j = i + 1; j < data.length; j++) {
				if(data[minIdx] > data[j]) {
					minIdx = j;
				}
			}
			if(i != minIdx) {
				int tmp = data[i];
				data[i] = data[minIdx];
				data[minIdx] = tmp;
			}
		}
		System.out.println(Arrays.toString(data));
	}

}
