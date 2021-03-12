package stream;

import java.io.*;
import java.util.LinkedList;

/**
 *
 * @author eduarda
 */
public class MainReadCSV {

    public static void main(String[] args) throws IOException {
        LeCSV leitorCsv = new LeCSV();
        LinkedList<Cliente> clientes = leitorCsv.leCsvClientes();
        TotalCompras compras = new TotalCompras();
        System.out.println(compras.calculaSomaTotal(clientes));
    }
}
