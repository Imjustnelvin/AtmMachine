package myfirstJavaProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws FileNotFoundException {
	Scanner sc = new Scanner(new File("anime.txt"));
	
	List<String> anime_array = new ArrayList<String>();
	
		while (sc.hasNextLine()) {
			anime_array.add(sc.nextLine());
		}
			for (int i = 0; i < anime_array.size(); i++) {
				System.out.println("My Favorite anime OAT: " + anime_array.get(i));
			}
	}

}
