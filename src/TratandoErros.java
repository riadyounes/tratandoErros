
public class TratandoErros {

	public static void main(String[] args) {
	    System.out.println("Inicio do main");
	    try {
	        metodo1();
	    } catch(ArithmeticException | NullPointerException ex) {
	        System.out.println("Exception");
	    }
	    System.out.println("Fim do main");
	    
	}

	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");	
	}
	private static void metodo2() {
	    System.out.println("Inicio do metodo2");
	    for(int i = 1; i <= 5; i++) {
	        System.out.println(i);
	        int a = i / 0;
	        Conta riad = null;
	        riad.deposita();
	    }
	    System.out.println("Fim do metodo2");
	    
	}
	
		
}
