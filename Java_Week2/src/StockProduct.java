import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat db = new DecimalFormat("#,###.#");
		Product[] stcProduct = new Product[4];
		for (int i = 0; i < stcProduct.length; i++) {
			stcProduct[i] = new Product();
			System.out.print("Input product Id    : ");
			stcProduct[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			stcProduct[i].setUnit(scan.nextInt());
			while (stcProduct[i].getUnit() <= 0) {
				System.out.print("Input product Unit, again   : ");
				stcProduct[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price : ");
			stcProduct[i].setPrice(scan.nextDouble());
			while (stcProduct[i].getPrice() <= 0) {
				System.out.print("Input product Price, again  : ");
				stcProduct[i].setPrice(scan.nextDouble());
			}
			System.out.println();
		} // end for
		System.out.println("------------------------------------------------------");
		int totalCount = 0;
		for (int i = 0; i < stcProduct.length; i++) {
			System.out.println("Product ID : "+stcProduct[i].getId()
					+", Total price = "+ db.format(stcProduct[i].calculate())+" baht.");
			totalCount += stcProduct[i].calculate();
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Total price of all products is "+db.format(totalCount)+" baht.");
	}
}
