/**
 * 
 */
package controlflow;
import controlflow.bai17;
import java.util.Scanner;

/**
 * @author vancuong
 *
 */
public class bai24 {

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
        int n=1;
        while(n<=sodong) {
        for(int i=1;i<=sodong-n;i++)System.out.print("  ");
        for(int j=1;j<=n;j++)System.out.print("* ");
        System.out.println();
        n++;
        }
        
               
	}
}