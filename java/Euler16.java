/*
* Project Euler #16 with a twist. Added some "cool" presentation :P
*/

import java.math.BigInteger;

public class Euler16 {
    
	public static void main(String[]args){        
		BigInteger biggest = BigInteger.valueOf(2); //Storjävla variabeln		
		BigInteger sum = BigInteger.valueOf(0); //Storjävla summan
        BigInteger bigten = BigInteger.valueOf(10); //En bigint att köra modulus med
        biggest = biggest.pow(1000); //Skapa storjävla talet 
        String antal = String.valueOf(biggest); //Skapa variabel för antal loopar
        
        for(int i=0 ; i<=antal.length(); i++) {        	
        	sum = sum.add(biggest.mod(bigten)); //Ta ut sista siffran och lägg till i sum
        	biggest = biggest.divide(bigten); //Ta bort sista siffran helt
        } 
        
        System.out.print("Initialize some big stuff ");
        dodots(10, 400);
        sleepnow(2000);
        System.out.println("");
        System.out.print("Loading the initialized big stuff ");
        dodots(10, 70);
        dodots(5, 700);
        dodots(15, 50);
        dodots(20, 20);
        dodots(20, 10);
        sleepnow(2000);
        System.out.println("");
        System.out.print("Calculating a random answer based on the loaded big stuff ");
        dodots(4, 700);
        sleepnow(2000);
        System.out.println("");
        System.out.print("The Stella Artois brewery was founded "); //Skriv ut skit'n
        dodots(5, 1000);
        System.out.print(" " + sum);
        
    }
	
	public static void sleepnow(int numberofsec) {
		try {
			Thread.sleep(numberofsec);
		} 
		catch (InterruptedException ie) {
		//Handle exception
		}			
	}
	
	public static void dodots(int numberofdots, int sleepfor) {
		
        for(int j=0; j<numberofdots; j++) {
            System.out.print(".");
            sleepnow(sleepfor);        
        }				
	}		
}