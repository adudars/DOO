/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author eduarda
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ArquivoComponent pasta = new ArquivoComposite("DOO/");
        ArquivoComponent arquivo1 = new ArquivoComposite("Exercicio.txt");
        ArquivoComponent arquivo2 = new ArquivoComposite("Trab1.txt");

        pasta.adicionarArquivo(arquivo1);
        pasta.adicionarArquivo(arquivo2);
        
        System.out.println("Pesquisando arquivo2:");
        pasta.getArquivo(arquivo2.getNomeDoArquivo()).printNomeDoArquivo();
        
        System.out.println("\nRemovendo arquivo1");
        pasta.removerArquivo(arquivo1.getNomeDoArquivo());
        pasta.printNomeDoArquivo();
    }
}
