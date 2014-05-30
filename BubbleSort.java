package test.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int data[] = {3,1,2,4,5,6,7,8,9,0};
		System.out.println(Arrays.toString(data));
		for(int i = data.length -1 ; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(data[j] > data[j+1]){
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
			System.out.println(Arrays.toString(data));
		}
	}
}
