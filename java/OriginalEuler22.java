/*
 * This is the solution for the original Euler #22 problem without handling of Swedish chars. * 
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class OriginalEuler22 {	
	
	public static void main(String[] args) {		
		if (args.length == 0) {
            System.out.println("Please give a text file as argument! Run with: \"java.exe -jar OriginalEuler22.jar <file.txt>\"");
        }
		else {		
        	int total = 0;
			StringBuilder sb = new StringBuilder();
			File file = new File(args[0]);
		  	try {			  	
		  		Scanner scanner = new Scanner(file);           
	            while(scanner.hasNext()) {
	               	sb.append(scanner.nextLine());
	            }            
	            scanner.close();
		  	} catch (FileNotFoundException e) {
	           	e.printStackTrace();
	        }
		
		  	String[] array = sb.toString().replaceAll("\"", "").split(",");
			Arrays.sort(array);
		
			for (String f : array) {
				int score = 0;
				for (int g = 0; g < f.length(); g++) {
					score = score + (f.toUpperCase().charAt(g) - 'A' + 1);										
					}					
				
				score = score * (Arrays.asList(array).indexOf(f) + 1);
				total += score;
				System.out.println(Arrays.asList(array).indexOf(f) + 1 + ". " + f + " has " + score + " total is now at " + total);				
			}	
			System.out.println("------------------------");
			System.out.println("Grand total score is: " + total);
		}
	}
}