import java.util.Scanner;

public class AtmMachine {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		int withdraw, deposit;
		int previousBalance, addedBalance;
		int num = 0;
		String fname, lname;
		int user_input1, user_input2;
		
		boolean done = false;
		
		System.out.println("ATM Machine in The Haus Yow");
		
			System.out.print("What's your first name?: ");
			fname = sc.nextLine();
			
			System.out.print("What's your first name?: ");
			lname = sc.nextLine();
		
		String fixedlCap = lname.substring(0, 1).toUpperCase() + lname.substring(1).toLowerCase(); //to fixed(Capitalize) first letter of a string last name
		String fixedfCap = fname.substring(0, 1).toUpperCase() + fname.substring(1).toLowerCase(); //to fixed(Capitalize) first letter of a string first name
				
		System.out.println("");	
		System.out.println("Welcome " +fixedlCap+ ", What would you like to do?");
		System.out.println("");
		System.out.println("Scenario: This is your first time "+fixedfCap+". Should you Withdraw or Deposit first? think.");
		System.out.println("");
		
		while (done == false) 
				{
					System.out.println("1: Withdraw");
					System.out.println("2: Deposit");
					System.out.println("3: Check balance");
					System.out.println("4: Exit");
					System.out.print("=> ");
					user_input1 = 0;
					
					try
					{
						num = sc.nextInt();
					}
					catch (Exception e) // to handle non integer input
					{
						System.out.println("Something isn't right. RIGHT??\nSolution: Restart the app and dont do it again :)");
						break;
					}
					
					if (num > 4 || num < 1) //to handle incorrect number (Out of range) 
					
					{
						System.out.println("Invalid Input. Please select only 1-4 \n");
						
					} 
					
					
				switch (num) 
					{
					case 1: // WITHDRAW CASE
						System.out.print("Enter amount to be withdrawn: ");
						withdraw = sc.nextInt();
						
								if (balance >= withdraw) 
								{
									balance = balance - withdraw;
									System.out.println("You successfuly withdraw your money. \"bekenemen\"");
									System.out.println("Your balance: " + balance);
								} 
							else 
							{
								System.out.println("You dont have enough balance to withdraw that amount.");
									System.out.println("Check balance? 1:Yes/2:No");
										user_input1 = sc.nextInt();
											
										if (user_input1 == 1) 
											{
												System.out.println("Current balance: "+balance+" Pesos");
											}
											else
											{
												continue;
											}
							} 
							
						
						System.out.println("");
						break;
					
					case 2: // DEPOSIT CASE
						System.out.print("Enter your amount to deposit: ");
						deposit = sc.nextInt();
						
							balance = balance + deposit;
							previousBalance = balance - deposit;
							addedBalance = deposit;
							
								System.out.println("Current balance: " + balance + " Pesos");
								System.out.println("Successfuly Deposited");
								
								System.out.println("View Details? 1:Yes/2:No");
									user_input2 = sc.nextInt();
								
											if (user_input2 == 1) 
											{
											System.out.println("Previous balance: " + previousBalance + " Pesos");
											System.out.println("Added Balance: "+ addedBalance +" Pesos");
											}
											else
											{
												continue;
											}
								System.out.println("");
						break;
					
					case 3:
						System.out.println("Current Balance: "+balance);
						break;
					
					case 4:
						System.out.println("Thank you for using my app :) ");
						done = true;
						break;
					}
				}
		
		
			
	}

}
