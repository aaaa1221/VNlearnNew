/**
 * 
 */
package controlflow;

import java.util.Scanner;

/**
 * @author vancuong
 *
 */
public class bai20 {
public static void main(String[] args) {
		
		System.out.print("Nhập số dòng cần hiển thị: ");
		Scanner scanner = new Scanner(System.in);
        int sodong = scanner.nextInt();
        System.out.println("-------------------- ");
        for(int i=1;i<=sodong;i++){
        	for(int j=1; j<=i;j++){
        		if((i+j)%2==0) {
        			System.out.print(0);
        		}else {
        			System.out.print(1);
				}
        	}
        	System.out.println();
        }
        
	}
}