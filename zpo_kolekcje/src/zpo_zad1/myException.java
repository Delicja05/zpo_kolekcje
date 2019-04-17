package zpo_zad1;

public class myException extends ArithmeticException{
	private static final long serialVersionUID = 1L;

	public myException(String msg){
    	super(msg);
    }
}