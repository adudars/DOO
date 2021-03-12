package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author eduarda
 */
public class LeCSV {

    public LinkedList<Cliente> leCsvClientes() throws IOException {

        LinkedList<Cliente> clientes = new LinkedList<Cliente>();

        String line;

        BufferedReader bufferreader = new BufferedReader(new FileReader("./src/criacao_prototipo_stream/arquivo.csv"));

        String[] cabecalho = bufferreader.readLine().split(";");

        while ((line = bufferreader.readLine()) != null) {
            String[] conteudo = line.split(";");

            Cliente cliente = new Cliente();
            cliente.setId(conteudo[0]);
            cliente.setNome(conteudo[1]);
            cliente.setEmail(conteudo[2]);
            cliente.setTelefone(conteudo[4]);
            cliente.setTotalCompras(Double.parseDouble(conteudo[5]));

            clientes.add(cliente);
        }

        return clientes;
    }
}
