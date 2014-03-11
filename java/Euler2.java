public class Euler2 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1; 
		int sum = 0; //Summan av de jämna talen som är under fyra mille
		
		//Loopa igenom Fibonaccis talserie, stanna om nästa är över fyra mille
		while((b+a) < 4000000) {
		    a = a + b;
			b = a - b;
		    		    
		    //Kolla om talet är ett jämnt tal, om så är fallet lägg till i sum
			if (a % 2 == 0) {
		    	System.out.printf(a + " ");
		    	sum = a + sum;
		    }
		}		
	System.out.printf("= " + sum);
	} 
}


