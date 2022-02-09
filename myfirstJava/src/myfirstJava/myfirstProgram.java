package myfirstJava;
import java.util.Scanner;
public class myfirstProgram {

	public static void main(String[] args) {
		System.out.println("My simple java");
		System.out.println("Enter your username:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("Hello "  + name + "!" + " How old are you?");
		int age = scanner.nextInt();
		
		if (age >= 18) {
			System.out.println("Pwede na makulong :p");
		} else {
			System.out.println("Batakapa");
		} 
		
		scanner.close();

	}

}
