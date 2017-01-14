package br.com.dextraining.domain;

public class UsuarioService {

	public static boolean logar(Usuario usuario) {
		if (usuario.getLogin().equals("raoni") && usuario.getSenha().equals("123")) {
			return true;
		}
		return false;
	}

}
