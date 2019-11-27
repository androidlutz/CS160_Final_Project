package salesOrder;
import java.util.Scanner;

public abstract class OrderSheet {
		
	public static void createNewSalesOrder() {
		//print date	
		java.util.Date date = new java.util.Date();
		System.out.println(date);		
		//new scanner
		Scanner orderNumber = new Scanner(System.in);
		int number;
		do {
		    System.out.println("Please enter a new sales order number");
		    while (!orderNumber.hasNextInt()) {
		        System.out.println("That's not a valid sales order number");
		        System.out.println("Please enter a new sales order number");
		        orderNumber.next(); // this is important! prompts new user input
		    }
		    number = orderNumber.nextInt();
		} while (number <= 0);
		System.out.println("The Sales Order Number is: " + number);
		
		
		Scanner customerNumber = new Scanner(System.in);
		int custnumber;
		do {
		    System.out.println("Please enter a Customer ID number");
		    while (!customerNumber.hasNextInt()) {
		        System.out.println("That's not a valid Customer ID number");
		        System.out.println("Please enter a Customer ID number");
		        customerNumber.next(); // this is important! prompts new user input
		    }
		    custnumber = customerNumber.nextInt();
		} while (custnumber <= 0);
		System.out.println("The Customer ID Number is: " + custnumber);
		System.out.println("Bob's Paper");
		System.out.println("425 Washington Street");
		System.out.println("The Dalles, OR, 97058");
		
		//Order input, quantity of boxes of paper
		Scanner paperQ = new Scanner(System.in);
		int paperBox;
		do {
			System.out.println(" ");
			System.out.println("Enter Case Quantity ");
		while(!paperQ.hasNextInt()) {
			System.out.println("That is Not a Valid Quantity ");
			System.out.println("Please Enter Case Quantity ");
		paperQ.next();  //prompts to enter again
		}
			paperBox = paperQ.nextInt();
		}while(paperBox <= 0);
		System.out.println(paperBox + " Boxes of Paper " );
		System.out.println("Total to be Invoiced " + "$" +(paperBox * 10));
		System.out.println("");

		
		//Finance Department 
		Scanner isPaid = new Scanner(System.in);
		String paid = "yes";
		
		do {
			System.out.println("Finance Department Bill To:");
			System.out.println("");
			System.out.println("Bob's Paper");
			System.out.println("P.O. Box 258");
			System.out.println("The Dalles, OR 97058");		
			System.out.println("");
			System.out.println("Has the Order Been Invoiced?  Type Yes or No");
			
		while(!isPaid.hasNext()); {
		
			
		}
			paid = isPaid.next();
		} while(isPaid.equals(paid));{
		  System.out.println("Order Has Been Invoiced. Please Pack the Order");
		  System.out.println("Has the order been packed?  Type Yes or No");
		  
		  while(!isPaid.hasNext()); {
			   paid = isPaid.next();
			  while(isPaid.equals(paid));
			  System.out.println("Order Has Been Packaged. Please Ship the Order");
			System.out.println("Has the order been Shipped?  Type Yes or No");
			
		}		while(!isPaid.hasNext()); {
			paid = isPaid.next();
			  while(isPaid.equals(paid));
			System.out.println("The package has been shipped successfully.");
			System.out.println("Continue to next customer? Type Yes to Continue.");
		}
		while(!isPaid.hasNext()); {
		}
	}
	
	
}	
}		
		
	
	
	
		
	
	
	
	

