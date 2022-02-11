import java.util.Scanner;
import java.util.Random;
import java.time.*;
import java.time.format.DateTimeFormatter;

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
	
	public static void generateNum() {
		Scanner scannerRandom = new Scanner(System.in);
		Random randomNum = new Random();
		int randomNumber = randomNum.nextInt(20);
		boolean success = false;
		int guess = 0;
		int numTries = 0;
		System.out.println("Please guess number 1-20");
		
		while(success == false) {
			System.out.print("Your guess: ");
			int user_input = scannerRandom.nextInt();
			numTries++;
				if (user_input == randomNumber) {
					System.out.println("Your guess is correct!\n");
					if (numTries > 5) {
						System.out.println("You tried  " +numTries+" times. Seriously?");
					} else {
						System.out.println("You tried  " +numTries+" times. Not bad!");
					}
					success = true;
					break;
				} else if (user_input > 20 || user_input < 1) {
					System.out.println("Out of range(Please enter 1-20)");
				} else if (user_input < randomNumber) {
					System.out.println("Too low");
				} else if (user_input > randomNumber) {
					System.out.println("Too high");
				}
		}
	}
	
	public static void main(String[] args) {
		Scanner scannermain = new Scanner(System.in); // Scanner Object
		//Variables
		boolean backMenu = false;
		
		LocalDateTime currentDate = LocalDateTime.now();
		DateTimeFormatter myNewFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		String date = currentDate.format(myNewFormat); 
		System.out.println(date); //added a date
		
		//LOGIC Baby
		do {
		System.out.println("Please select option below: ");
		System.out.println("1: Print a FullName");
		System.out.println("2: Add Two Number");
		System.out.println("3: Guessing Game(easy)"); 
		System.out.println("4: To Quit");
		System.out.print("Please enter your number: ");
		int userInputNum = scannermain.nextInt();
		
		if (userInputNum == 1) { // Option 1
				System.out.println("\nYou selected \"Print a FullName\"");
				printName(); // <-- Calling method
					System.out.print("Back to menu? (0:Yes|1:No) :");
					int user_select = scannermain.nextInt();
						if (user_select == 0) {
							backMenu = true;
						} else {
							System.out.println("Thank you for using my App :)");
							break;
						}
			} else if (userInputNum == 2) { // Option 2
					System.out.println("\nYou selected \"Add Two Number\"");
					addTwo(); // <-- Calling method
						System.out.print("Back to menu? (0:Yes|1:No) :");
						int user_select = scannermain.nextInt();
							if (user_select == 0) {
								backMenu = true;
							} else {
								System.out.println("Thank you for using my App :)");
								break;
							}
			} else if (userInputNum == 3) { //Option 3
				System.out.println("\nYou selected \"Guessing Game\"");
				generateNum();// <-- Calling method
					System.out.print("Back to menu? (0:Yes|1:No) :");
						int user_select = scannermain.nextInt();
							if (user_select == 0) {
								backMenu = true;
							} else {
								System.out.println("Thank you for using my App :)");
								break;
							}
			} else if (userInputNum > 4 || userInputNum < 1) { // if user select not on option
					System.out.println("\n######Invalid Input######\n");
					backMenu = true; //to continue the loop
			} else if (userInputNum == 4) { // if user want to quit
					System.out.println("System response: Kunware nag exit yung app");
					break;
			}
		
		} while (backMenu = true);
		scannermain.close();
	} 
		
}


