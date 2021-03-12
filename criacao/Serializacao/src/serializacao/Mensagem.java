/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacao;

import java.io.Serializable;

/**
 *
 * @author eduarda
 */
public class Mensagem implements Serializable {

    private String texto;
    private Usuario usuarioEnvio;
    private Usuario usuarioRecebe;

    public Mensagem() {}

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getUsuarioEnvio() {
        return usuarioEnvio;
    }

    public void setUsuarioEnvio(Usuario usuarioEnvio) {
        this.usuarioEnvio = usuarioEnvio;
    }

    public Usuario getUsuarioRecebe() {
        return usuarioRecebe;
    }

    public void setUsuarioRecebe(Usuario usuarioRecebe) {
        this.usuarioRecebe = usuarioRecebe;
    }  

}
