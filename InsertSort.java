package test.sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int data[] = {3,1,2,4,5,6,7,8,9,0};
		System.out.println(Arrays.toString(data));
		for(int i = 1; i < data.length; i++) {
			for(int j = i; j > 0; j--){
				if(data[j] < data[j-1]){
					int tmp = data[j-1];
					data[j-1] = data[j];
					data[j] = tmp;
				}
			}
			System.out.println(Arrays.toString(data));
		}
	}
}
