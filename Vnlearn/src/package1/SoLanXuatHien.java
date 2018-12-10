/**
 * 
 */
package package1;

import java.util.Scanner;

/**
 * @author vancuong
 *
 */
public class SoLanXuatHien {

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
      
       
		
	}

}
