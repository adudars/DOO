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
public class RecuperarUsuarioSerializado {

    public static void main(String[] args) throws Exception {
        {
            Usuario user = null;
            Usuario user2 = null;
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + 
                    "/src/criacao_prototipo_serializacao/usuario_serializado.ser");
            //Recupera objeto
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (Usuario) in.readObject();
            user2 = (Usuario) in.readObject();
            in.close();

            System.out.println("Deserializando Usuarios...");
            System.out.println("Nome: " + user.getNome());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Senha: " + user.getSenha());
            System.out.println("\nNome: " + user2.getNome());
            System.out.println("Email: " + user2.getEmail());
            System.out.println("Senha: " + user2.getSenha());

        }
    }
}