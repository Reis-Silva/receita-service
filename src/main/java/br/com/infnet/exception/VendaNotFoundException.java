package br.com.infnet.exception;

public class VendaNotFoundException extends RuntimeException {
    public VendaNotFoundException(){

    }

    public VendaNotFoundException(String message){
        super(message);
    }
}
