/**
 * 
 */
package package1;

import java.util.Scanner;

/**
 * @author vancuong
 *
 */
public class Aray {

	/**
	 * Create by: vancuong - CTO VnLearn
	 * Create date: 10 thg 12, 2018
	 * Modifier: vancuong
	 * Modified date: 10 thg 12, 2018
	 * Description: ....
	 * Version 1.0
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }

	
		int min = arr[0];
		int max= arr[1];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("giá trị nhỏ nhất của mảng là : "+ min);
		System.out.println("giá trị lớn nhất của mảng là : "+ max);
		
		
	}

}
