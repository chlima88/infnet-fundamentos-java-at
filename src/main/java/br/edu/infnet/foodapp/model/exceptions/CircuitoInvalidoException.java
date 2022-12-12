package br.edu.infnet.foodapp.model.exceptions;

public class CircuitoInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;

	public CircuitoInvalidoException(String mensagem) {
		super("\r\n[ERRO] " + mensagem);
	}
}
