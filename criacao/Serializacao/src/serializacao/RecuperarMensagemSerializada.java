package serializacao;

import java.io.*;

/**
 *
 * @author eduarda
 */
public class RecuperarMensagemSerializada {

    public static void main(String[] args) throws Exception {
        {
            Mensagem mensagem = null;
            
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + 
                    "/src/criacao_prototipo_serializacao/mensagem_serializada.ser");
            //Recupera objeto
            ObjectInputStream in = new ObjectInputStream(fileIn);
            mensagem = (Mensagem) in.readObject();
            in.close();

            System.out.println("Deserializando Mensagem...");
            System.out.println("Texto: " + mensagem.getTexto());
            System.out.println("Usuario envio: " + mensagem.getUsuarioEnvio().getNome());
            System.out.println("Usuario recebe: " + mensagem.getUsuarioRecebe().getNome());

        }
    }
}