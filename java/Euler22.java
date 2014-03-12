/* 
<<<<<<< HEAD
* This version is able to handle Swedish ÅÄÖ although the sorting for ÅÄÖ isn't working 100%, the score is "correct" based on that it sorts ÄÅÖ.
* It also handles a file with names listed as following "Åke Andersson, Örjan Öst, Erland Svensson" etc. compared to the original Euler that had only uppercase and no
* white space. The code solves Euler22 original file ok! Give a text file without BOM as arguemnt.
=======
* This version is able to handle Swedish ï¿½ï¿½ï¿½ although the sorting for ï¿½ï¿½ï¿½ isn't working 100%, the score is "correct" based on that it sorts ï¿½ï¿½ï¿½.
* It also handles a file with names listed as following "ï¿½ke Andersson, ï¿½rjan ï¿½st, Erland Svensson" etc. compared to the original Euler that had only uppercase and no white space. The code solves Euler22 original file ok! Give a text file without BOM as arguemnt.
>>>>>>> 9327045c836bc8e0e11935d88a7d66b877a7c365
*/

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Euler22 {	
	
	public static void main(String[] args) {		
		if (args.length == 0) {
            System.out.println("Ange en fil! Kï¿½r med: \"java -jar Euler22.jar <fil.txt>\"");
        }
		else {		
        	int total = 0;
			StringBuilder sb = new StringBuilder();
		
			File file = new File(args[0]);
			//File file = new File("/Uppdrag/Java/names1.txt");
		  	try {			  	
		  		Scanner scanner = new Scanner(file, "UTF-8");           
	            while(scanner.hasNext()) {
	               	sb.append(scanner.nextLine());
	            }            
	            scanner.close();
		  	} catch (FileNotFoundException e) {
	           	e.printStackTrace();
	        }
		
		  	String[] array = sb.toString().replaceAll("\"", "").replaceAll(", ", ",").split(",");
			Arrays.sort(array);
		
			for (String f : array) {
				int score = 0;
				for (int g = 0; g < f.length(); g++) {
					switch (f.toUpperCase().charAt(g)) {
						case 'ï¿½':
							score = score + 27;
							break;						
						case 'ï¿½':
							score = score + 28;
							break;						
						case 'ï¿½':
							score = score + 29;
							break;
						case '-':
							break;
						case ' ':
							break;
						default:
							score = score + (f.toUpperCase().charAt(g) - 'A' + 1);
							break;					
					}					
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
