package main.java.br.com.jrenan.exceptions;

/**
 * @author rodrigo.pires
 */
public class DadosInvalidosException extends Exception {

    public DadosInvalidosException(String msg) {
        this(msg, null);
    }

    public DadosInvalidosException(String msg, Throwable e) {
        super(msg, e);
    }
}
