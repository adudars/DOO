/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacao;

import java.io.*;

/**
 *
 * @author eduarda
 */
public class SaveMensagemSerializada {
    
    public static void main(String[] args) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath();        

        Mensagem mensagem = new Mensagem();
        Usuario userEnvio = new Usuario();
        Usuario userRecebe = new Usuario();
        
        mensagem.setTexto("Ei, joao! Como esta?");
        userEnvio.setNome("Camila");
        userRecebe.setNome("Joao");
        mensagem.setUsuarioEnvio(userEnvio);
        mensagem.setUsuarioRecebe(userRecebe);
               
        FileOutputStream fileSerializado = new FileOutputStream( 
                current + "/src/criacao_prototipo_serializacao/mensagem_serializada.ser");                
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        
        outputSerializado.writeObject(mensagem);
        outputSerializado.close();
        
        System.out.println("Mensagem Salva");        
        System.out.println("Arquivo gerado em: " + current + 
                "/src/criacao_prototipo_serializacao/mensagem_serializada.ser");
        
        
    }
}