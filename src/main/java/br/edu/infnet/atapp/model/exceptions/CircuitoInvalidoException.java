package br.edu.infnet.atapp.model.exceptions;

public class CircuitoInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;

	public CircuitoInvalidoException(String mensagem) {
		super("[ERRO] " + mensagem);
	}
}
