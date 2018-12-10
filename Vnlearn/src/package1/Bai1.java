package package1;

import java.util.Scanner;

public class Bai1 {
	/**
	 * Create by: vancuong - CTO VnLearn
	 * Create date: 10 thg 12, 2018
	 * Modifier: vancuong
	 * Modified date: 10 thg 12, 2018
	 * Description: đổi độ C sang độ F
	 * Version 1.0
	 * @param celsius
	 * @return
	 */
	static double fah(double celsius) {
		return (double) 9 / 5 * celsius + 32;
	}

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
		 double celsius; 
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("chương Trình đổi độ C sang độ F");
		    celsius = scanner.nextDouble();
		    System.out.println(celsius + " độ C = " + fah(celsius) + " độ F");
	}
}
