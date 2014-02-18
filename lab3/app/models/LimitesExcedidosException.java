package models;


/**
 * 
 * Excessao caso o limite de creditos do periodo seja alcancado
 * 
 */
public class LimitesExcedidosException extends Exception{
		
	private static final long serialVersionUID = 1L;
	
	public LimitesExcedidosException(){
		super("Limite de créditos , no periodo,  excedido!");
	}
	
	/*
	private String message = "Limite de créditos , no periodo,  excedido!";
	
	public String getMessage(){
		return this.message;
	}
	*/

}

