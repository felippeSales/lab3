package models;

public class LimitesExcedidosException extends Exception{
	
	private String message = "Limite de Creditos no periodo excedido.";
	
	public String getMessage(){
		return this.message;
	}

}

