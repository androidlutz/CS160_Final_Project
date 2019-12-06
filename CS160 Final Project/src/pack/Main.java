//HEADER
//Program Name: Simple Sheets Final Project
//Author: Andrew Lutz, Robert Brinker, Armando Negrete
//Class: CS160 Fall 2019
//Date: 12/5/2019
//Description: A program which fulfills the requirements of the simple sheets order form.



package pack;
import java.util.Scanner;
public class Main {

	//an array that contains objects		
		private static java.util.ArrayList<Object> objects = new java.util.ArrayList<Object>(); 
		public static void main(String[] args) {
					
	 		
		//get the the user input
		while(true) {
			int option = OrderEntry.selectOption();
			processOption(option);
		}
	}


	
	public static void processOption(int option) {
		/**
		 * Example 1 driver program using an if..else if..else
		 */
		//perform logic determining the option chosen by user
		//-1 = end program
		if(option == -1)
			System.exit(0);
		//1 = make new object
		else if(option == 1) {
			Order o = new Order();
			OrderEntry.newObject(o);
			objects.add(o);
			//print the object information
		}
		//2 = print existing orders
		else if(option == 2) {
			System.out.println("=====BEGIN REPORT=====");
			for(Object o : objects) {
				if(o != null) {
					OrderEntry.printObject(o);
					System.out.println();
					System.out.println();
				}
			}
			System.out.println("=====END REPORT=====");
		}
		else if(option == 3) {
			for(Object o : objects) 
			OrderEntry.changeObject(o);
			
			//Order o = new Order();
			//Field[] fields = o.getClass().getDeclaredFields();
			//for(Field field : fields)
				//System.out.println("Enter value for " + o.status + ": ");
			
			
				
			    //o.status = scanner.nextLine();
		}
		
		//final error message
		else {
			System.err.println("Option selected was not understood.");
		}

		/**
		 * Example 2 driver program using a case statement
		 */

	}


	}

/*
 * FOOTER
 * 
 * Available Options:
1 = Enter New Order
2 = Print Existing Orders
3 = Change Existing Order
-1 = End Program
Please select an option(1, 2, 3, -1):
1
Creating new Order:
Enter value for orderDate: 
12/5/2019
Enter value for salesAssociate: 
John Doe
Enter value for customerNumber: 
1234
Enter value for Status: 
Paid
Enter value for billingAddress: 
123 Starlight Lane The Dalles, OR 97058
Enter value for shippingAddress: 
123 Starlight Lane The Dalles, OR 97058
Enter value for productName: 
Paper
Enter value for productQuantity: 
10
Enter value for productCost: 
20.00
Enter value for totalCost: 
200.00
Available Options:
1 = Enter New Order
2 = Print Existing Orders
3 = Change Existing Order
-1 = End Program
Please select an option(1, 2, 3, -1):
2
=====BEGIN REPORT=====
orderDate: 12/5/2019
salesAssociate: John Doe
customerNumber: 1234
Status: Paid
billingAddress: 123 Starlight Lane The Dalles, OR 97058
shippingAddress: 123 Starlight Lane The Dalles, OR 97058
productName: Paper
productQuantity: 10
productCost: 20.0
totalCost: 200.0


=====END REPORT=====
Available Options:
1 = Enter New Order
2 = Print Existing Orders
3 = Change Existing Order
-1 = End Program
Please select an option(1, 2, 3, -1):
3
Status
Available Options:
1 = Enter New Order
2 = Print Existing Orders
3 = Change Existing Order
-1 = End Program
Please select an option(1, 2, 3, -1):
 * 
 */

