/**
 * 
 */
package controlflow;

import java.util.Scanner;

/**
 * @author vancuong
 *
 */
public class bai18 {

	/**
	 * Create by: vancuong - CTO VnLearn
	 * Create date: 13 thg 12, 2018
	 * Modifier: vancuong
	 * Modified date: 13 thg 12, 2018
	 * Description: ....
	 * Version 1.0
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Nhập số dòng cần hiển thị: ");
		Scanner scanner = new Scanner(System.in);
        int sodong = scanner.nextInt();
        System.out.println("-------------------- ");
        int dem=1;
        for(int i=1;i<=sodong;i++){
        	for(int j=1; j<=i;j++){
        		System.out.print(dem+" ");
        		dem++;
        	}
        	System.out.println();
        }
        
	}

	}


