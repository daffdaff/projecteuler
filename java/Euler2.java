public class Euler2 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1; 
		int sum = 0; //Summan av de j�mna talen som �r under fyra mille
		
		//Loopa igenom Fibonaccis talserie, stanna om n�sta �r �ver fyra mille
		while((b+a) < 4000000) {
		    a = a + b;
			b = a - b;
		    		    
		    //Kolla om talet �r ett j�mnt tal, om s� �r fallet l�gg till i sum
			if (a % 2 == 0) {
		    	System.out.printf(a + " ");
		    	sum = a + sum;
		    }
		}		
	System.out.printf("= " + sum);
	} 
}


