package br.edu.infnet.atapp.model.exceptions;


public class PrecoBaseInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;

	public PrecoBaseInvalidoException(String mensagem) {
		super("[ERRO] " + mensagem);
	}
	
}
