import java.util.Scanner;

public class Main {
	
	static  void printName() {
		Scanner scannername = new Scanner(System.in);
		
		System.out.print("Your First Name: ");
		String firstName = scannername.nextLine();
		
		System.out.print("Your Last Name: ");
		String lastName = scannername.nextLine();
		
		System.out.println("\nRESULT: Hello there " + firstName + " " + lastName + "!\n\n");
	}
	
	public static void addTwo() {
		Scanner scanneradd = new Scanner(System.in);
		
		System.out.print("Enter your First Number: ");
		int firstNum = scanneradd.nextInt();
		
		System.out.print("Enter your Second Number: ");
		int secondNum = scanneradd.nextInt();
		int result = firstNum + secondNum;
	
		System.out.println("\nRESULT: " + firstNum + " + "+ secondNum + " = " + result +"\n");
	}
	
	public static void main(String[] args) {
		Scanner scannermain = new Scanner(System.in);
		//Variables
		boolean backMenu = false;
		//Code
		do {
		System.out.println("Please select option below: ");
		System.out.println("1: Print a FullName");
		System.out.println("2: Add 2 Number");
		System.out.println("3: Guessing Game(easy)"); //not added
		System.out.println("4: To Quit");
		System.out.print("Please enter your number: ");
		int userInputNum = scannermain.nextInt();
		
			if (userInputNum == 1) {
				System.out.println("\nYou selected \"Print a FullName\"");
				printName(); // <-- Calling method 
				backMenu = true;
					continue;
				} else if (userInputNum == 2) {
					System.out.println("\nYou selected \"Add 2 Number\"");
					addTwo(); // <-- Calling method
					backMenu = true;
					continue;
				}
				else if (userInputNum > 4 || userInputNum < 1) { // if user select not on option
					System.out.println("\n######Invalid Input######\n");
					backMenu = true;
				} else if (userInputNum == 4) { // if user want to quit
					System.out.println("-->Kunware nag exit yung app<--");
					break;
				}
		
		} while (backMenu = true);
		scannermain.close();
		
	} 
		
}


