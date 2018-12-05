import java.rmi.Naming;

public class CalculatorClient { 
	/* Essa classe é responsável pela obetenção de uma referência pro servidor no registro RMI,
	 chamando os métodos da calculadora*/

	public static void main(String[] args) { 

  		try {
			Calculator c = (Calculator) Naming.lookup();
			System.out.println( c.sub(4, 3) ); 
			System.out.println( c.add(4, 5) ); 
			System.out.println( c.mul(3, 6) ); 
			System.out.println( c.div(9, 3) ); 

		} catch (Exception e) {
			System.out.println(e);
		} 
   }   
} 
