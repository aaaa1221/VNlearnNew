/**
 * 
 */
package package1;

import java.util.Scanner;

/**
 * @author vancuong
 *
 */
public class Sapsep {

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
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
       
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
       
        sort(arr);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        show(arr);
    }

        public static void sort(int [] arr) {
            int temp = arr[0];
            for (int i = 0 ; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }


	
        public static void show(int [] arr) {
        	for (int i = 0; i < arr.length; i++) {
        		System.out.print(arr[i] + " ");
    }
}


}
