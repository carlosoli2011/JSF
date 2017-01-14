package br.com.dextraining.web.controller;

import javax.faces.bean.ManagedBean;

import br.com.dextraining.domain.Usuario;
import br.com.dextraining.domain.UsuarioService;

@ManagedBean(name="loginMB")
public class LoginMB {

	private Usuario usuario = new Usuario();
	
	private boolean logado;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public void login() {
		this.logado = UsuarioService.logar(this.usuario);
	}
	 
}
