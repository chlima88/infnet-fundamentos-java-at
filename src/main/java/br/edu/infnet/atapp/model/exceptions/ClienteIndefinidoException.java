package br.edu.infnet.atapp.model.exceptions;

public class ClienteIndefinidoException extends Exception {
	private static final long serialVersionUID = 1L;

	public ClienteIndefinidoException(String mensagem) {
		super("[ERRO] " + mensagem);
	}
}
