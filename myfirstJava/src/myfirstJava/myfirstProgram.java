package myfirstJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class myfirstProgram {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("names.txt"));
		List<String> names = new ArrayList<String>(); //names = Object of ArrayList
		
		while (sc.hasNextLine()) { //while names.txt has a string
			names.add(sc.nextLine()); // it will add the string of names.txt to names(ArrayList)
		}
	
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
