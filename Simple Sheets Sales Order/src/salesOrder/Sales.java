package salesOrder;
import java.util.Scanner;
public class Sales {
	
	public static void inputSalesInfo() {
		//new scanner
		Scanner orderNumber = new Scanner(System.in);
		//prompt to enter data
		System.out.println("Please Enter a New Order Number");
		int salesOrderNumber = orderNumber.nextInt();
		
		int i = salesOrderNumber;
		if(i < 1 ) {
			System.out.println("Invalid, Please Enter a Customer Number");

			}
		else {
			
		
		}
		Scanner customerNumber = new Scanner(System.in);
		//prompt to enter customer number
		System.out.println("Please Enter Customer Number");
		int customerInfoNumber = customerNumber.nextInt();
		
		int j = customerInfoNumber;
		if(j < 1) {
			System.out.println("Invalid, Please Enter a Customer Number");

		}
		else {

		}
	}
}
