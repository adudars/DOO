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
public class SaveUsuarioSerializado {
    
    public static void main(String[] args) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath();        

        Usuario usuario = new Usuario();
        usuario.setEmail("joao@email.com");        
        usuario.setNome("joao");
        usuario.setSenha("password");
        
        Usuario usuario2 = new Usuario();
        usuario2.setEmail("camila@email.com");        
        usuario2.setNome("camila");
        usuario2.setSenha("c4m1la");
               
        FileOutputStream fileSerializado = new FileOutputStream( 
                current + "/src/criacao_prototipo_serializacao/usuario_serializado.ser");                
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        
        outputSerializado.writeObject(usuario);
        outputSerializado.writeObject(usuario2);
        outputSerializado.close();
        
        System.out.println("Usuarios Salvos");        
        System.out.println("Arquivo gerado em: " + current + 
                "/src/criacao_prototipo_serializacao/usuario_serializado.ser");
        
        
    }
}