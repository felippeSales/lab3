package models;

public class LimitesExcedidosException extends Exception{
	
	private String message = "Limite de créditos , no periodo,  excedido!";
	
	public String getMessage(){
		return this.message;
	}

}

