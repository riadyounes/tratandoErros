
public class TratandoErros {

	public static void main(String[] args) {
	    System.out.println("Inicio do main");
	    try {
	        metodo();
	    } catch(ArithmeticException | NullPointerException ex) {
	        System.out.println("Exception");
	    }
	    System.out.println("Fim do main");
	    
	}

	
	private static void metodo() {
	    System.out.println("Inicio do metodo2");
	    for(int i = 1; i <= 5; i++) {
	        System.out.println(i);
	        int a = 4 / 0;
	        Conta riad = null;
	        riad.deposita();
	    }
	    System.out.println("Fim do metodo2");
	    
	}
	
		
}
