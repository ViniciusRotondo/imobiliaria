package br.com.imobiliaria.exceptions;

public class DuplicateEmailException  extends RuntimeException{
    public DuplicateEmailException(String message) {
        super(message);
    }
    public DuplicateEmailException(String message, Throwable cause) {
        super("E-mail já existente: ", cause);
    }
}
